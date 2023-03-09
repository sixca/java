package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.service.AccountService;

public class AccountRegisterTest11 {

	public static void main(String[] args) {
		CRUDService<String, AccountDTO> service = new AccountService();
		AccountDTO obj = 
				new AccountDTO(MakeAccountNumber.makeAccNum(), 10000, "id01");			
		
		AccountDTO obj2 = 
				new AccountDTO(MakeAccountNumber.makeAccNum(), 20000, "id01");			
		
		AccountDTO obj3 = 
				new AccountDTO(MakeAccountNumber.makeAccNum(), 30000, "id02");			
	
		try {
			service.register(obj);
			service.register(obj2);
			service.register(obj3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// get(k) test ------------------------------------
		AccountDTO Account = null;
		try {
			Account = service.get("202339100");
			System.out.println(Account);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// get() test ------------------------------------
		// Emp e = new Manager();
		// List list = new ArrayList();
		
		List<AccountDTO> list = null;
		
		try {
			list = service.get();
			for(AccountDTO u: list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// remove() test ------------------------------------
		try {
			service.remove("202339101");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}




