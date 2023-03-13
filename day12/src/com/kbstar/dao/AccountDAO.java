package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
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
		// obj가 사용하고있는 계좌를 찾아서 걔를 어레이리스트에 리턴한다
		List<AccountDTO> list = new ArrayList<AccountDTO>();
		Collection<AccountDTO> col = db.values();
		
		for (AccountDTO acc : col) {
			//계좌중에서 id가 obj와 같은 것들만
			if((acc.getHolder()).equals(obj)) {
				list.add(acc);
			}
		}
		return list;
	}
	
//	@Override
//	public List<TransactionDTO> select(Object obj) throws Exception {
//		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
//		Collection<TransactionDTO> col = db.values();
//		for (AccountDTO acc : col) {
//			//계좌중에서 id가 obj와 같은 것들만
//			if((acc.getHolder()).equals(obj)) {
//				list.add(acc);
//			}
//		}
//		return list;
//	}

}
