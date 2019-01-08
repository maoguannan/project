package com.project.dao;

import java.util.List;

public interface ICutPageDao<T> {
	/**
	 * 根据当前页数获取当前页的信息
	 * @param currpage
	 * @return 当前页的信息的集合
	 */
	public List<T> getListByCurrentPage(int currpage);
}
