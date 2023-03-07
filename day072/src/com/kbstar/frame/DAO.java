package com.kbstar.frame;

public interface DAO<K, V> {        //K타입이 들어오고, V타입이 들어올 것이라 미리 예상해서 정의하는 것 "제네릭"
	public void insert(V v);   //끼워넣기
	public void delete(K k);
	public void update(V v);
}
