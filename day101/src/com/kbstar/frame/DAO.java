package com.kbstar.frame;

import java.util.List;

public interface DAO<K, V> {    //제네릭 선언. 키와 밸류로 구성할게요
	//데이터베이스에 데이터를 입력 수정 삭제 조회를 하려고 한다
	//일반적인 CRUD (Create, Read, Update, Delete)
	public void insert(V v) throws Exception;
	public void update(V v) throws Exception;
	public void delete(K k) throws Exception;
	public V select(K k) throws Exception;   //지정값 가져오기 ::내가 select에 K값을 넣으면 V값으로 가져와. 
	public List<V> select() throws Exception;  //전체값 가져오기 :: select()는 10명을 생성하고 집어넣어서 그 리스트를 통째로 던져주는  함수여
}
