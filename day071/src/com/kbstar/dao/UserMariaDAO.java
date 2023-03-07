package com.kbstar.dao;

import com.kbstar.frame.DAO;

public class UserMariaDAO implements DAO{

	@Override
	public void insert(Object obj) {
		System.out.println(obj);
		System.out.println("Inserted MariaDB...");		
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj);
		System.out.println("Deleted MariaDB...");	
	}

	@Override
	public void update(Object obj) {
		System.out.println(obj);
		System.out.println("updated MariaDB...");
	}
	
}
