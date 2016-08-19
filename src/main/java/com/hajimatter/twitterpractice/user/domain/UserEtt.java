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
	private String favoriteArtist;
	@Getter
	private Date registerDateTime;
	
	public UserEtt(String username, String password, String favoriteArtist) {
		this.username = username;
		this.password = password;
		this.favoriteArtist = favoriteArtist;
		this.registerDateTime = new Date();
	}

	/**
	 * データバースのレコードをdomainへ変換する際使うコンストラクター
	 * @param id
	 * @param username
	 * @param password
	 * @param registerDateTime
	 */
	public UserEtt(long id, String username, String password, String fovoriteArtist, Date registerDateTime) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.favoriteArtist = fovoriteArtist;
		this.registerDateTime = registerDateTime;
	}

	public UserEtt(long id, String favoriteArtist) {
		this.id = id;
		this.favoriteArtist = favoriteArtist;
	}
	
}
