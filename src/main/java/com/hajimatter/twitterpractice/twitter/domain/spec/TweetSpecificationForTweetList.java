package com.hajimatter.twitterpractice.twitter.domain.spec;

import org.dbflute.bhv.readable.CBCall;

import com.hajimatter.dbflute.cbean.TweetCB;

public class TweetSpecificationForTweetList implements ITweetSpecification {

	private long userId;
	
	@Override
	public CBCall<TweetCB> toQuery() {
		return cb -> {
			cb.query().setUserId_Equal(userId);
		};
	}
	
	public TweetSpecificationForTweetList (long userId) {
		this.userId = userId;
	}
	
}
