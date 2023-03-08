package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO> {

	HashMap<Integer, ItemDTO> db = null;
	
	public ItemDAO() {
		db = new HashMap<Integer, ItemDTO>();
	}
 
	@Override
	public void insert(ItemDTO v) throws Exception {
		if(db.containsKey(v.getId())) {
			throw new Exception();
		}
		db.put(v.getId(), v);		
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if(!db.containsKey(v.getId())) {
			throw new Exception();
		}
		db.put(v.getId(), v);
	}

	@Override
	public void delete(Integer k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception();
		}
		db.remove(k);
	}
	
	@Override
	public ItemDTO select(Integer k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception();
		}
		ItemDTO item = null;
		item = db.get(k);		
		return item;
	}

	@Override
	public List<ItemDTO> select() throws Exception {
		if(db.size() == 0) {
			throw new Exception();
		}
		ArrayList<ItemDTO> list = new ArrayList<ItemDTO>();
		Collection<ItemDTO> col = db.values();
		//ArrayList 목록을 list변수로 생성하고
		//db의 모든 값(value)들을 col변수로 컬렉션
		for(ItemDTO u : col) {
			list.add(u);
		}
		return list;
	}
}

	
	