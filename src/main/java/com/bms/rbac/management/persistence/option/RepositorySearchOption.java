package com.bms.rbac.management.persistence.option;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 用户查询类
 *
 * @author rongzhida
 *
 */
public class RepositorySearchOption extends SearchOption {

    private String searchword;
    private String username;
    private int pages;
    private int count;	
	public String getSearchword() {
		return searchword;
	}
	public void setSearchword(String searchword) {
		this.searchword = searchword;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	 	
}
