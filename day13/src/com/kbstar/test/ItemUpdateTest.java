package com.kbstar.test;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemUpdateTest {

   public static void main(String[] args) {
      CRUDService<String, Item> crudService =
            new ItemCRUDServiceImpl();
      
      Item item = new Item("2023314161100", "T-shirt", 30000, 3.1, null);
      try {
         crudService.modify(item);
         System.out.println("성공");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}