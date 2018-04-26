package com.my.book.mapper;

public interface BaseMapper<T> {

	void insert(T entity);
	
	void del(String id);
	
	void update(T entity);
	
	T findById(String id);
}
