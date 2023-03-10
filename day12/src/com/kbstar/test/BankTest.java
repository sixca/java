package com.kbstar.test;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.service.BankService;
import com.kbstar.service.BankServiceImpl;

public class BankTest {

	public static void main(String[] args) {
		BankService<UserDTO, AccountDTO, TransactionDTO, String, String> service;
		service = new BankServiceImpl();      //기능정의 완료

		// Register
		UserDTO user = new UserDTO("id01", "pwd01", "name", "a@naver.com", "111");
		try {
			service.register(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// Login
		String id = "id01";
		String pwd = "pwd01";  //화면에서 id와 pwd를 입력받는다
		UserDTO loginUser = null;   // 정상이면 받을 준비. 로그인정보 받기로 했지
		try {
			loginUser = service.logIn(id, pwd);
			System.out.println("Login OK~~");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
