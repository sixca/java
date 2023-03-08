package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO>{

	@Override
	public void insert(ItemDTO v) throws Exception {
		connect(); 
		if(v.getId() == 101) {
			throw new Exception("EX0007");
		}
		System.out.println(v);
		System.out.println("Inserted...");	
		close();    
	}
	
	@Override
	public void delete(Integer k) throws Exception {
		connect();
		if(k == 101) {
			throw new Exception("EX0008");
		}
		System.out.println(k);
		System.out.println("deleted...");					
		close();
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if(v.getId() == 101) {
			throw new Exception("EX0009");
		}
		System.out.println(v);
		System.out.println("updated...");			
	}


}
