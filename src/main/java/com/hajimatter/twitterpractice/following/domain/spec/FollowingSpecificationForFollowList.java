package com.hajimatter.twitterpractice.following.domain.spec;

import java.util.List;

import org.dbflute.bhv.readable.CBCall;

import com.hajimatter.dbflute.cbean.UserFollowingCB;

public class FollowingSpecificationForFollowList implements IFollowingSpecification {

	private long followerUserId;
	
	private List<Long> followingUserIds;
	
	@Override
	public CBCall<UserFollowingCB> toQuery() {
		return cb -> {
			cb.query().setFollowerUserId_Equal(followerUserId);
			cb.query().setFollowingUserId_InScope(followingUserIds);
		};
	}
	
	public FollowingSpecificationForFollowList (long followerUserId, List<Long> followingUserIds) {
		this.followerUserId = followerUserId;
		if(followingUserIds == null || followingUserIds.size() == 0){
			throw new IllegalArgumentException("followingUserIds cannot be empty");
		}
		this.followingUserIds = followingUserIds;
	}
}
