package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.CartDaoImpl;
import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dao.ItemDaoImpl;
import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.DAO;
import com.kbstar.frame.ShopService;
public class ShopServiceImpl implements ShopService<Cust, Cart> {
	//로긘할 떄는 Cust, 상품조회할 때는 Cart가 필요
	DAO<String, String, Cust> custDao;
	DAO<String, String, Item> itemDao;
	DAO<String, String, Cart> cartDao;
	
	public ShopServiceImpl() {
		custDao = new CustDaoImpl();
		itemDao = new ItemDaoImpl();
		cartDao = new CartDaoImpl();
	}
	
	@Override
	public Cust login(String id, String pwd) throws Exception {
		Cust cust = null;  
		cust = custDao.select(id);  
		if (cust != null) {
			if(cust.getPwd().equals(pwd)) {
				System.out.println("OK");
			}else {
				throw new Exception("로그인 실패");
			}
			
		}else {
			throw new Exception("로그인 실패");
		}
		return cust;	
	}

	@Override
	public void register(Cust v) throws Exception {
		try {
			custDao.insert(v);
		}catch(Exception e) {
			throw new Exception("등록 오류");
		}
		//notification.sendEmail(v.getEmail(), "축하 합니다");
		//notification.sendSMS(v.getContact(), "축하 합니다");
	}

	@Override
	public List<Cart> myCart(String id) throws Exception {
		// 사용자의 id를 넣으면, 그 사용자의 카트를 가지고 와라. 
		//dao에 안 만들어져있지만,, 함수는 있지(search)
		List<Cart> list = null;
		try {
			list = cartDao.search(id);	
		} catch (Exception e) {
		//예외를 어떻게 처리할지 	
		}
		return list;
	}

}
