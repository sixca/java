package com.kbstar.frame;

import java.util.List;

public interface CRUDService<K, V> {
	public void register(V v) throws Exception;
	public void remove(K k) throws Exception;
	public void modify(V v) throws Exception;
	public V get(K k) throws Exception;   //사용자의 id값을 넣으면 사용자의 모든 V(value, 정보)가 넘어올 것이다
	public List<V> get() throws Exception; //모든 정보를 List에 담는다
}
