package com.hajimatter.twitterpractice.user.domain.spec;

import org.dbflute.bhv.readable.CBCall;

import com.hajimatter.dbflute.cbean.UserCB;

public class UserSpecificationByUserName implements IUserSpecification {

	private String userName;
	
	@Override
	public CBCall<UserCB> toQuery() {
		return cb->{
			cb.query().setUserName_Equal(userName);
		};
	}

	public UserSpecificationByUserName (String userName) {
		this.userName = userName;
	}
}
