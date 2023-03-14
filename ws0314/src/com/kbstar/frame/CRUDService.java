package com.kbstar.frame;

import java.util.List;

//사용자를 등록,삭제,수정,조회
public interface CRUDService<K, V> {
	public void register(V v) throws Exception;
	public void modify(V v) throws Exception;
	public void remove(K k) throws Exception;
	public V get(K k) throws Exception;
	public List<V> get() throws Exception;
	
	
}
