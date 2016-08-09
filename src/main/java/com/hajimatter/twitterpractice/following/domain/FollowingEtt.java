package com.hajimatter.twitterpractice.following.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

/**
 * @author junya.shirahama
 */
public class FollowingEtt {

	@Getter
	private long id;
	@Getter
	private long followerUserId;
	@Getter
	private long followingUserId;
	
	@JsonCreator
	public FollowingEtt(@JsonProperty("followerUserId") long followerUserId,@JsonProperty("followingUserId") long followingUserId) {
		this.followerUserId = followerUserId;
		this.followingUserId = followingUserId;
	}

//	/**
//	 * api用のコンストラクタ。業務ロジックに使わないでください。
//	 */
//	public FollowingEtt() {
//	}
	
}
