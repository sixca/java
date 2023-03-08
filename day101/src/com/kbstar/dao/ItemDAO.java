package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO> {

	HashMap<String, ItemDTO> db = null;
	
	public ItemDAO() {
		db = new HashMap<String, ItemDTO>();
	}

	@Override
	public void insert(ItemDTO v) throws Exception {
		if(db.containsKey(v.getId())) {
			throw new Exception();
		}
		db.put(Integer.toString(v.getId()), v);		
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if(!db.containsKey(v.getId())) {
			throw new Exception();
		}
		db.put(Integer.toString(v.getId()), v);
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
		if(db.containsKey(k)) {
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
		for(ItemDTO u : col) {
			list.add(u);
		}
		return list;
	}
}

	
	