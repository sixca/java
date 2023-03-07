package com.kbstar.service;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;

public class ItemService implements Service<Integer, ItemDTO>, SearchService {  //primary값 int를 객체로 잡을 때, integer를 써서 문법을 완성시킨다

	DAO<Integer,ItemDTO> dao;
	public ItemService() {
		dao = new ItemDAO();    //Item Data Access Object로 사용하겠다. 이걸 바꿀 때 마다 다른 Object로 저장하겠지 //이렇게 함으로써 가용성이 보여진다
	}    // DAO클래스를 활용해서 ItemDAO를 통해 Object를 저장할거야
	
	@Override
	public void search() {
		System.out.println("Item search...");
	}

	@Override
	public void register(ItemDTO v) {
		System.out.println(v + "Data check..");
		dao.insert(v);    // dao 활용
		System.out.println("Send SMS..");
	}

	@Override
	public void remove(Integer k) {
		System.out.println(k + "Data Check..");
		dao.delete(k);
		System.out.println("Send SMS..");		
	}

	@Override
	public void modify(ItemDTO v) {
		System.out.println(v + "Data Check..");
		dao.update(v);
		System.out.println("Send SMS..");		
	}
}
