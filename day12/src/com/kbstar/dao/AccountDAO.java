package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;

public class AccountDAO implements DAO<String, AccountDTO>{

	HashMap<String, AccountDTO> db; //해시맵은 key타입과 값타입이 필수
	
	public AccountDAO() {
		db = new HashMap<String, AccountDTO>();
	}
	
	@Override
	public void insert(AccountDTO v) throws Exception {
		db.put(v.getAccNo(), v);
		
	}

	@Override
	public void delete(String k) throws Exception {
		db.remove(k);
	}

	@Override
	public void update(AccountDTO v) throws Exception {
		db.put(v.getAccNo(), v);
		
	}

	@Override
	public AccountDTO select(String k) throws Exception {
		AccountDTO obj = null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<AccountDTO> select() throws Exception {
		List<AccountDTO> list = new ArrayList<AccountDTO>();
		Collection<AccountDTO> col = db.values();
		for(AccountDTO obj : col) {
			list.add(obj);
		}
		return list;
	}
	
	//사용자의 계좌 조회
	//obj : 사용자의 id;
	//Object obj = new String();
	@Override
	public List<AccountDTO> search(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
