package com.dada.business.common.api.model;

import java.io.Serializable;

/**
 * 
 * Title: PageQuery Description: 分页查询基础模型
 * 
 * @author ssc
 * @date 2016年4月18日 下午5:10:01
 */
public class PageQuery<T extends PageQuery<T>> implements Serializable {

	private static final long serialVersionUID     = 1L;

	public static final int DEFAULT_ITEMS_PER_PAGE = 20;

	private int page;													// 当前页
	private int itemsPerPage;											// 每页显示记录数

	public PageQuery() {
		this(0, DEFAULT_ITEMS_PER_PAGE);
	}

	public PageQuery(int page) {
		this(page, DEFAULT_ITEMS_PER_PAGE);
	}

	public PageQuery(int page, int itemsPerPage) {
		this.page = page;
		this.itemsPerPage = itemsPerPage;
	}

	public int getPage() {
		return page;
	}

	@SuppressWarnings("unchecked")
	public T setPage(int page) {
		this.page = page;
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T setItemsPerPage(int itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
		return (T) this;
	}

	public int getItemsPerPage() {
		return itemsPerPage;
	}

	public int getOffset() {
		return page < 2 ? 0 : (page - 1) * itemsPerPage;
	}

}
