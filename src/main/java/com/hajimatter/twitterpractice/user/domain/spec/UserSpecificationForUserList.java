package com.hajimatter.twitterpractice.user.domain.spec;

import org.dbflute.bhv.readable.CBCall;

import com.hajimatter.dbflute.cbean.UserCB;

public class UserSpecificationForUserList implements IUserSpecification {

	private String userName;
	
	@Override
	public CBCall<UserCB> toQuery() {
		return cb -> {
			
		};
	}
	
	public UserSpecificationForUserList (String userName) {
		this.userName = userName;
	}
}
