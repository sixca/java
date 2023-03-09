package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.service.TransactionService;

public class TransactionRegisterTest {

	public static void main(String[] args) {
		CRUDService<String, TransactionDTO> service = new TransactionService();
		TransactionDTO obj = 
				new TransactionDTO(MakeAccountNumber.makeTrNum(),"20230309100",500,"O","국민카드");			
		TransactionDTO obj2 = 
				new TransactionDTO(MakeAccountNumber.makeTrNum(),"20230309100",600,"O","국민카드");			
		TransactionDTO obj3 = 
				new TransactionDTO(MakeAccountNumber.makeTrNum(),"20230309100",700,"O","국민카드");			
	
		try {
			service.register(obj);
			service.register(obj2);
			service.register(obj3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// get(k) test ------------------------------------
		TransactionDTO Transaction = null;
		try {
			Transaction = service.get("id01");
			System.out.println(Transaction);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// get() test ------------------------------------
		// Emp e = new Manager();
		// List list = new ArrayList();
		
		List<TransactionDTO> list = null;
		
		try {
			list = service.get();
			for(TransactionDTO u: list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}




