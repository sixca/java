package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.ItemDaoImpl;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeItemNumber;

public class ItemCRUDServiceImpl implements CRUDService<String, Item> {

	DAO<String, String, Item> dao;
	
	public ItemCRUDServiceImpl() {
		dao = new ItemDaoImpl();
	}

	@Override
	public void register(Item v) throws Exception {
		try { 
			String id = MakeItemNumber.makeItemNum();
			v.setId(id);
			dao.insert(v);

		}catch(Exception e) {
			if(e instanceof SQLIntegrityConstraintViolationException) {     //중복값 오류문구 지정해주면
				throw new Exception("ID가 중복 되었습니다");
			}else {
				e.printStackTrace();
				throw new Exception("시스템오류입니다.");    //DB장애일 경우는 이렇게 표시가능
			}
			
		}
	}

	@Override
	   public void modify(Item v) throws Exception {
	      try{
	         dao.update(v);
	      }catch(Exception e) {
	         if(e instanceof SQLRecoverableException) {
	            throw new Exception("시스템 장애");
	         }else {
	            e.printStackTrace();
	            throw new Exception("해당 상품이 존재하지 않습니다.");
	         }
	      }
	      
	   }

	@Override
	   public void remove(String k) throws Exception {
	      // 데이터 검증
	      // DB 입력
	      try {
	         dao.delete(k);
	      } catch (Exception e) {
	         if (e instanceof SQLRecoverableException) {
	            throw new Exception("시스템 장애 입니다.");
	         } else {
	            throw new Exception("해당 ID가 존재 하지 않습니다.");
	         }
	      }
	   }//민철댈님
	
	@Override
	public Item get(String k) throws Exception {
		Item obj = null;
		try { 
			obj = dao.select(k);	
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			}else {
				//e.printStackTrace();
				throw new Exception("ID가 존재하지 않음"); 
			}
							
		}
		return obj;
	}

	@Override
	public List<Item> get() throws Exception {
		List<Item> list = null;
		try {
		list = dao.selectAll();
		} catch (Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다");
			}else {
				throw new Exception("조회내용 없음");
			}
		}
		return list;
	}

}
