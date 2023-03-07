package com.kbstar.dao;

import com.kbstar.frame.DAO;

public class AccountOracleDAO implements DAO{

	@Override
	public void insert(Object obj) {
		System.out.println(obj);
		System.out.println("Inserted Oracle...");
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj);
		System.out.println("deleted Oracle...");
	}

	@Override
	public void update(Object obj) {
		System.out.println(obj);
		System.out.println("updated Oracle...");
	}
	
}
