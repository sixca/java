package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemSelectAllTest {

	public static void main(String[] args) {
		CRUDService<String,Item> service = 
				new ItemCRUDServiceImpl();
		
		List<Item> list = null;
			try {
				list = service.get();
				if(list.size() == 0) {
					System.out.println("데이터가 없음");
					return;
				}else {
					for(Item obj : list) {
						System.out.println(obj);
					}
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}
