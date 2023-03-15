package com.kbstar.frame;

import java.util.List;

//화면에서 요청하는 거라고 생각하고 작성하세요
//V1=UserDTO  V2=accountDTO  V3=transactionDTO K=String id P=String pwd

public interface BankService<V1, V2, V3, K, P> {
	public void register(V1 v) throws Exception;    //뱅킹시스템을 위한 별도의 회원가입 기능
	public V1 logIn(K k, P p) throws Exception; 
	public void makeAccount(K k, double money) throws Exception;
	public List<V2> getAllAccount(K k) throws Exception;               //보유계좌 조회
	public List<V3> getAllTransaction(String acc) throws Exception;   //이체내역 조회
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception;
	
}
