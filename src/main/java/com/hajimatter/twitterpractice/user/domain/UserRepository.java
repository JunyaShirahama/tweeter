package com.hajimatter.twitterpractice.user.domain;

import java.sql.Date;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hajimatter.dbflute.exbhv.UserBhv;
import com.hajimatter.dbflute.exentity.User;
import com.hajimatter.twitterpractice.user.domain.spec.IUserSpecification;

@Repository
public class UserRepository {

	@Autowired
	private UserBhv userBhv;

	public void add(UserEtt user) {
		User entity = new User();
		entity.setUserName(user.getUsername());
		entity.setPassword(user.getPassword());

		userBhv.insert(entity);
	}

	/**
	 * 一つの会員を検索する。見つかったらUserEttを返却する。なかったらnullを返却する。
	 * 
	 * @param spec
	 * @return
	 */
	public UserEtt findOne(IUserSpecification spec) {
		OptionalEntity<User> user = userBhv.selectEntity(spec.toQuery());
		// userBhv.selectEntity(cb->{
		// cb.query().setUserName_Equal(userName);
		// cb.query().setPassword_Equal(password);
		// }).get();
		if (user.isPresent()) {
			return convertToEntity(user.get());
		} else {
			return null;
		}
	}
	
	public List<UserEtt> find(IUserSpecification spec) {
		ListResultBean<User> selectList = userBhv.selectList(spec.toQuery());
		if(selectList == null) {
			return null;
		} else {
			List<UserEtt> userList = new ArrayList<>();
			for (User user : selectList) {
				UserEtt userEtt = convertToEntity(user);
				userList.add(userEtt);
			}
			return userList;
		}
	}

	private UserEtt convertToEntity(User user) {
		if (user == null) {
			return null;
		}
		return new UserEtt(user.getUserId(), user.getUserName(), user.getPassword(),
				Date.from(user.getRegisterDatetime().atZone(ZoneId.systemDefault()).toInstant()));
	}
}
