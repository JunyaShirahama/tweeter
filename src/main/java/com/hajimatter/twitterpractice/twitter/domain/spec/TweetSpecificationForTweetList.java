package com.hajimatter.twitterpractice.twitter.domain.spec;

import java.util.List;

import org.dbflute.bhv.readable.CBCall;

import com.hajimatter.dbflute.cbean.TweetCB;

public class TweetSpecificationForTweetList implements ITweetSpecification {

	private List<Long> followingUserIds;
	
	@Override
	public CBCall<TweetCB> toQuery() {
		return cb -> {
			cb.query().setUserId_InScope(followingUserIds);
		};
	}
	
	public TweetSpecificationForTweetList (List<Long> followingUserIds) {
		if (followingUserIds == null || followingUserIds.size() == 0) {
			throw new IllegalArgumentException("followingUserIds cannot be empty");
		}
		this.followingUserIds = followingUserIds;
	}
	
}
