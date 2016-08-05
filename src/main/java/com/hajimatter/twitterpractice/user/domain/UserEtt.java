package com.hajimatter.twitterpractice.user.domain;

import java.util.Date;

import lombok.Getter;

public class UserEtt {
	
	@Getter
	private long id;
	@Getter
	private String username;
	@Getter
	private String password;
	@Getter
	private Date registerDateTime;
	
	public UserEtt(String username, String password) {
		this.username = username;
		this.password = password;
		this.registerDateTime = new Date();
	}

	/**
	 * データバースのレコードをdomainへ変換する際使うコンストラクター
	 * @param id
	 * @param username
	 * @param password
	 * @param registerDateTime
	 */
	public UserEtt(long id, String username, String password, Date registerDateTime) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.registerDateTime = registerDateTime;
	}
	
}
