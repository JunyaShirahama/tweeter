package com.hajimatter.twitterpractice.user.domain.spec;

import org.dbflute.bhv.readable.CBCall;

import com.hajimatter.dbflute.cbean.UserCB;

public class UserSpecificationByUserId implements IUserSpecification {

	private long userId;
	
	@Override
	public CBCall<UserCB> toQuery() {
		return cb -> {
			cb.query().setUserId_Equal(userId);
		};
	}
	
	public UserSpecificationByUserId(long userId) {
		this.userId = userId;
	}
}
