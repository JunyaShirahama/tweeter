package com.hajimatter.twitterpractice.following.domain.spec;

import org.dbflute.bhv.readable.CBCall;

import com.hajimatter.dbflute.cbean.UserFollowingCB;

public class FollowingSpecificationByUserId implements IFollowingSpecification {

	private long userId;
	
	@Override
	public CBCall<UserFollowingCB> toQuery() {
		return cb -> {
			cb.query().setFollowerUserId_Equal(userId);
		};
	}
	
	public FollowingSpecificationByUserId (long userId) {
		this.userId = userId;
	}
}
