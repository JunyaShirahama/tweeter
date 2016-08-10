package com.hajimatter.twitterpractice.following.domain.spec;

import org.dbflute.bhv.readable.CBCall;

import com.hajimatter.dbflute.cbean.UserFollowingCB;

public interface IFollowingSpecification {

	public CBCall<UserFollowingCB> toQuery();
}
