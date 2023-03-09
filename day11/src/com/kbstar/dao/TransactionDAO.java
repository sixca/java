package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.DAO;

public class TransactionDAO implements DAO<String, TransactionDTO>{	
	HashMap<String, TransactionDTO> db;

	public TransactionDAO() {
		db = new HashMap<>();
	}

	@Override
	public void insert(TransactionDTO v) throws Exception {
		db.put(v.getDate(), v);
		
	}

	@Override
	public void delete(String k) throws Exception {
	
		
	}

	@Override
	public void update(TransactionDTO v) throws Exception {
	
		
	}

	@Override
	public TransactionDTO select(String k) throws Exception {
		TransactionDTO obj = null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<TransactionDTO> select() throws Exception {
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		Collection<TransactionDTO> col = db.values();
		for(TransactionDTO obj : col) {
			list.add(obj);
		}
		return list;
	}

	

}
