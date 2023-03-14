package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartUpdateTest {

   public static void main(String[] args) {
      CRUDService<String, Cart> service =
            new CartCRUDServiceImpl();
      
      Cart obj = new Cart("2023314235100", "id04", "100", 20, null);
      try {
         service.modify(obj);
         System.out.println("성공");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}