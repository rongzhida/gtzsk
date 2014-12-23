package com.bms.rbac.management.persistence.option;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 查询基类
 * 
 */
public class SearchOption {

	/** 页数 */
	private int page = 1;

	/** 一页行数 */
	private int rows = 10;

	/** 数据库开始行，自动计算 */
	private int startRow = 0;

	/** 数据库结束行，自动计算 */
	private int endRow = 10;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getStartRow() {
		startRow = (page - 1) * rows;
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		endRow = page * rows;
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
