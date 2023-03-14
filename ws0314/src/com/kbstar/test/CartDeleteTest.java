package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartDeleteTest {

	public static void main(String[] args) {
	      CRUDService<String, Cart> service = new CartCRUDServiceImpl();
	      try {
	         service.remove("2023314634100");
	         System.out.println("성공");
	      } catch (Exception e) {
	         System.out.println(e.getMessage());
	      }
	   }
}
