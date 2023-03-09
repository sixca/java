package com.kbstar.frame;

import java.util.List;

public interface DAO<K, V> {
	public void insert(V v) throws Exception;
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K k) throws Exception;   //사용자의 id값을 넣으면 사용자의 모든 V(value, 정보)가 넘어올 것이다
	public List<V> select() throws Exception; //모든 정보를 List에 담는다
}
