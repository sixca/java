package com.kbstar.test;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemDeleteTest {

	public static void main(String[] args) {
	      CRUDService<String, Item> service = new ItemCRUDServiceImpl();
	      try {
	         service.remove("★아이디★");
	         System.out.println("성공");
	      } catch (Exception e) {
	         System.out.println(e.getMessage());
	      }
	   }
}
