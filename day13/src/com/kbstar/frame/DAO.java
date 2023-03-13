package com.kbstar.frame;

import java.util.List;

public interface DAO<K1, K2, V> {
	 public void insert(V v) throws Exception;
	 public void delete(K1 k) throws Exception;
	 public void update(V v) throws Exception;
	 public V select(K1 k) throws Exception;
	 public List<V> selectAll() throws Exception;
	 public List<V> search(K2 k) throws Exception;
}
