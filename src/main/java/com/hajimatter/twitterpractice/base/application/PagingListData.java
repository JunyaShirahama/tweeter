package com.hajimatter.twitterpractice.base.application;

import java.util.List;

import lombok.Getter;

public class PagingListData<T> {

	@Getter
	private Integer currentPageNumber;
	@Getter
	private boolean existsNextPage;
	@Getter
	private List<T> data;

	public PagingListData(Integer currentPageNumber, boolean existsNextPage, List<T> data) {
		this.currentPageNumber = currentPageNumber;
		this.existsNextPage = existsNextPage;
		this.data = data;
	}
	
}
