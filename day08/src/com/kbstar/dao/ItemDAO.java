package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO>{

	@Override
	public void insert(ItemDTO v) {
		connect(); 
		System.out.println(v);
		System.out.println("Inserted...");	
		close();    
	}
	
	@Override
	public void delete(Integer k) {
		connect();
		System.out.println(k);
		System.out.println("deleted...");					
		close();
	}

	@Override
	public void update(ItemDTO v) {
		System.out.println(v);
		System.out.println("updated...");			
	}


}
