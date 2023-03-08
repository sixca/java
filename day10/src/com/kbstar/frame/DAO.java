package com.kbstar.frame;

public interface DAO<K, V> {        //K타입이 들어오고, V타입이 들어올 것이라 미리 예상해서 정의하는 것 "제네릭"
	public static final String IP = "127.0.0.1";  // 상수, public static final은 생략 가능
			
	public void insert(V v) throws Exception;  //예외상황 다루기 위해 throws   
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	
	//디폴트 메서드
	default void connect() {
		System.out.println(IP+"에 접속하였습니다.");
	}
	default void close() {
		System.out.println(IP+"에 접속을 해제 하였습니다.");
	}
}
