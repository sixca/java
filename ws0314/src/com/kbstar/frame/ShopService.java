package com.kbstar.frame;

import java.util.List;
//로긴, 레지스터, 카트조회
public interface ShopService<V, C> {
	public V login(String id, String pwd) throws Exception;
	public void register(V v) throws Exception;
	public List<C> myCart(String id) throws Exception;     //내 아이디를 넣으면 카드정보 조회


}
