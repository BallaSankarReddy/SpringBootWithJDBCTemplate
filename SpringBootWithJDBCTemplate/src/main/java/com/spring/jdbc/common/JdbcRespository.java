package com.spring.jdbc.common;

import java.util.List;

public interface JdbcRespository<T extends JdbcEntity> {

	public List<T> findAll();

	public T findById(Integer id);

	public Integer delete(Integer id);

}
