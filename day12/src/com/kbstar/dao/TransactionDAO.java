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
	//거래내역은 삭제수정 불가
		
	}

	@Override
	public void update(TransactionDTO v) throws Exception {
	//거래내역은 삭제수정 불가
		
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
	//고객이 보유하고 있는 계좌 번호를 입력하면,
	//해당 계좌의 거래내역을 조회한다
	@Override
	public List<TransactionDTO> search(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
