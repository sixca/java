package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class CustCRUDServiceImpl implements CRUDService<String, Cust>{

	DAO<String, String, Cust> dao;  //DAO를 이용한다
		
	public CustCRUDServiceImpl() {
		dao = new CustDaoImpl();
	}
	
	
	@Override
	public void register(Cust v) throws Exception {
		// 데이터 검증
		// DB입력
		try { 
			dao.insert(v);	
		}catch(Exception e) {
			if(e instanceof SQLIntegrityConstraintViolationException) {     //중복값 오류문구 지정해주면
				throw new Exception("ID가 중복 되었습니다");
			}else {
				throw new Exception("시스템 장애 입니다.");    //DB장애일 경우는 이렇게 표시가능
			}
			
		}
	}

	@Override
	public void modify(Cust v) throws Exception {
		try { 
			dao.update(v);	
		}catch(Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			}else {
				throw new Exception("해당 ID가 존재하지 않습니다");			
			}
		}
	}
	

	@Override
	public void remove(String k) throws Exception {
		try { 
			dao.delete(k);	
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {   //DB오류 시 예외코드
				throw new Exception("시스템 장애");
			}else {
				throw new Exception("해당 ID가 존재하지 않습니다"); 
			}
							
		}
	}

	@Override
	public Cust get(String k) throws Exception {
		Cust cust = null; //!!
		try { 
			cust = dao.select(k);	
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			}else {
				throw new Exception("조회내용 없음"); 
			}
							
		}
		return cust;  //!!
		
	}

	@Override
	public List<Cust> get() throws Exception {
		List<Cust> list = null;  //!!
		try { 
			list = dao.selectAll();	
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			}else {
				throw new Exception("조회내용 없음"); 
			}
							
		}
		return list;  
	}
	
}
