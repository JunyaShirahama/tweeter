package com.hajimatter.twitterpractice.following.domain;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hajimatter.dbflute.exbhv.UserFollowingBhv;
import com.hajimatter.dbflute.exentity.UserFollowing;
import com.hajimatter.twitterpractice.following.domain.spec.IFollowingSpecification;

/**
 * @author junya.shirahama
 */
@Repository
public class FollowingRepository {

	@Autowired
	private UserFollowingBhv userFollowingBhv;
	
	public Long add(FollowingEtt following) {
		UserFollowing entity = new UserFollowing();
		entity.setFollowerUserId(following.getFollowerUserId());
		entity.setFollowingUserId(following.getFollowingUserId());
		userFollowingBhv.insert(entity);
		return entity.getUserFollowingId();
	}
	
	public FollowingEtt findOne(IFollowingSpecification spec) {
		OptionalEntity<UserFollowing> userFollowing = userFollowingBhv.selectEntity(spec.toQuery());
		if (userFollowing.isPresent()) {
			return convertToEntity(userFollowing.get());
		} else {
			return null;
		}
	}
	
	public List<FollowingEtt> find(IFollowingSpecification spec) {
		ListResultBean<UserFollowing> selectList = userFollowingBhv.selectList(spec.toQuery());
		if (selectList == null) {
			return null;
		} else {
			ArrayList<FollowingEtt> followingList = new ArrayList<>();
			for (UserFollowing userFollowing : selectList) {
				FollowingEtt followingEtt = convertToEntity(userFollowing);
				followingList.add(followingEtt);
			}
			return followingList;
		}
	}
	
	private FollowingEtt convertToEntity(UserFollowing userFollowing) {
		if (userFollowing == null) {
			return null;
		}
		return new FollowingEtt(userFollowing.getFollowerUserId(), userFollowing.getFollowingUserId());
	}
}
