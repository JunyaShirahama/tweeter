package com.hajimatter.twitterpractice.user.domain.spec;

import org.dbflute.bhv.readable.CBCall;

import com.hajimatter.dbflute.cbean.UserCB;

public interface IUserSpecification {

	public CBCall<UserCB> toQuery();
}
