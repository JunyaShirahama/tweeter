package com.hajimatter.twitterpractice.user.view;

import lombok.Getter;

/**
 * User Presentation Object
 * @author junya.shirahama
 *
 */
public class UserPO {
	
	@Getter
	private Long id;
	@Getter
	private String username;
	@Getter
	private boolean following;

	public UserPO(String username) {
		this.username = username;
	}

	public UserPO(Long id, String username, boolean following) {
		this.id = id;
		this.username = username;
		this.following = following;
	}
	
}
