package com.kbstar.frame;

public interface Service<K,V> {
	public void register(V v);   //회원가입
	public void remove(K k);
	public void modify(V v);
}
