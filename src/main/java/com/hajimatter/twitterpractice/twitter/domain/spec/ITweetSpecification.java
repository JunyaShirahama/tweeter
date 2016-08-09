package com.hajimatter.twitterpractice.twitter.domain.spec;

import org.dbflute.bhv.readable.CBCall;

import com.hajimatter.dbflute.cbean.TweetCB;

public interface ITweetSpecification {

	public CBCall<TweetCB> toQuery();
}
