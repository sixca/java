package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

// 정보가 들어오면 DATABASE에 입력수정삭제 하는 기능입죠
public class UserDAO implements DAO<String, UserDTO> {

	@Override
	public void insert(UserDTO v) {
		connect(); 
		System.out.println(v.getId()+"님이 저장 되었습니다");	
		close();
	}

	@Override
	public void delete(String k) {
		connect(); 
		System.out.println(k + "님이 저장 되었습니다");			
		close();
	}

	@Override
	public void update(UserDTO v) {
		System.out.println(v.getId() + "님에 정보가 수정 되었습니다.");
	}

}
