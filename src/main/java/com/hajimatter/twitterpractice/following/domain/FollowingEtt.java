package com.hajimatter.twitterpractice.following.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * @author junya.shirahama
 */
public class FollowingEtt {

	@Getter
	private Long id;
	@Getter
	@Setter
	private Long followerUserId;
	@Getter
	private Long followingUserId;
	
	@JsonCreator
	public FollowingEtt( @JsonProperty("followingUserId") long followingUserId) {
		this.followingUserId = followingUserId;
	}

//	/**
//	 * api用のコンストラクタ。業務ロジックに使わないでください。
//	 */
//	public FollowingEtt() {
//	}
	
}
