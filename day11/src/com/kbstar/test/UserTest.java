package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserService;

public class UserTest {

	public static void main(String[] args) {
		CRUDService<String, UserDTO> service = new UserService();
		UserDTO obj = 
		new UserDTO("id01", "pwd01", "james1", "james1@gmail.com", "010-2912-5784");
		UserDTO obj2 = 
		new UserDTO("id02", "pwd02", "james2", "james2@gmail.com", "010-2912-5784");
		UserDTO obj3 = 
		new UserDTO("id03", "pwd03", "james3", "james3@gmail.com", "010-2912-5784");
		
		//insert() test------------------
		try {
			service.register(obj);
			service.register(obj2);
			service.register(obj3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		//get() TEST --------------------
		List<UserDTO> list = null;
		try {
			list = service.get();
			for (UserDTO u : list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//remove() test -------------------
		try {
			service.remove("id05");  //없는 id05를 지우려면 예외쥐
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
