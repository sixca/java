package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustDeleteTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = 
				new CustCRUDServiceImpl();
		
		Cust cust = new Cust("id21", "pwd21", "tomm", 30);
			try {
				crudService.remove(cust.getId());
				System.out.println("성공");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}
