package com.hajimatter.twitterpractice.user.domain.spec;

import org.dbflute.bhv.readable.CBCall;

import com.hajimatter.dbflute.cbean.UserCB;

public class UserSpecificationForLogin implements IUserSpecification{
	
	private String userName;
	
	private String password;

	@Override
	public CBCall<UserCB> toQuery() {
		return cb->{
			cb.query().setUserName_Equal(userName);
			cb.query().setPassword_Equal(password);
		};
	}

	public UserSpecificationForLogin(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

}
