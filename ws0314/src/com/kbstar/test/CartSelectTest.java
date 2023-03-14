package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartSelectTest {

	public static void main(String[] args) {
		CRUDService<String,Cart> service = 
				new CartCRUDServiceImpl();
		
		Cart obj = null;
			try {
				obj = service.get("2023314235100");
				System.out.println(obj);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}
