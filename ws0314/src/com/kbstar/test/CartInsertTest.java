package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartInsertTest {

	public static void main(String[] args) {
		CRUDService<String,Cart> service = 
				new CartCRUDServiceImpl();
		
		Cart obj = new Cart("id88", "8888001", 20);
			try {
				service.register(obj);
				System.out.println("성공");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}
