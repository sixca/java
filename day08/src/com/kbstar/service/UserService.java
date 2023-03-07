package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;
//SearchService 인터페이스를 추가로 만들고, 인터페이스 추가하여 기능을 쓸 수도 있음
public class UserService implements Service<String, UserDTO>, SearchService{
	DAO<String, UserDTO> dao;  //Service 인터페이스는 DAO 인터페이스에서 활용될거니까
	
	public UserService() {
		dao = new UserDAO();
	}
	
	@Override
	public void search() {
		System.out.println("Search...");
		
	}

	@Override
	public void register(UserDTO v) {
		System.out.println("Security Check..");
		dao.insert(v);  // database에 반영
		System.out.println("Send mail..");
		System.out.println("Send SMS..");
		//회원가입 시 보안체크, 메일로도 보내고, SMS도 보내는 기능
	}

	@Override
	public void remove(String k) {
		dao.delete(k);
		System.out.println("Send mail..");		
	}

	@Override
	public void modify(UserDTO v) {
		dao.update(v);
		System.out.println("Send SMS..");		
	}

//	@Override
//	public void search() {
//		// TODO Auto-generated method stub
//		
//	}
	
//	public void search() {
//		System.out.println("Search...");
//	}
	
}
