package com.kbstar.frame;

public interface Service<K,V> {  //제네릭 Key, Value
	public void register(V v);   //회원가입
	public void remove(K k);
	public void modify(V v);
//	public void search();     // search기능을 여기에 넣을수도 있음
}
