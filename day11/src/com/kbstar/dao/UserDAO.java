package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO> {

	HashMap<String, UserDTO> db;
	
	public UserDAO() {
		db = new HashMap<>();
	}

	@Override
	public void insert(UserDTO v) throws Exception {
		if(db.containsKey(v.getId())) {
			throw new Exception("DB Error");
		}  // 요렇게 하면 DB error 문구를 Service 인터페이스를 지나 App 화면단까지 날아감.
		db.put(v.getId(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception("");
		}
		db.remove(k);
		
	}

	@Override
	public void update(UserDTO v) throws Exception {
		if(!db.containsKey(v.getId())) {
			throw new Exception("");
		}
		db.put(v.getId(), v);
	}

	@Override
	public UserDTO select(String k) throws Exception {
		UserDTO obj = null;  //UserDTO 타입의 obj 생성
		obj = db.get(k);		
		return obj;
	}

	@Override
	public List<UserDTO> select() throws Exception {
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();  //리스트 바구니만들고요
		Collection<UserDTO>	col = db.values();  //db에서 values을 다 갖고 와서, collection col에 담다		
		for (UserDTO obj : col) {
			list.add(obj);
		}                                         //집합이다!하면 for문 떠올리고,, obj를 하나하나 담는다

		return list;
	}

}
