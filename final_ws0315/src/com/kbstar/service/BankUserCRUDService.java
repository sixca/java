package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.BankUserDaoImpl;
import com.kbstar.dto.BankUserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class BankUserCRUDService implements CRUDService<String, BankUserDTO> {

	DAO<String, String, BankUserDTO> userDao;
	
	public BankUserCRUDService() {
		userDao = new BankUserDaoImpl();
	}

	@Override
	public void register(BankUserDTO v) throws Exception {
		try {
		userDao.insert(v);
		} catch(Exception e) {
			if (e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("ID 중복");
			} else {
				throw new Exception("시스템 장애");
			}
		} 
	}

	@Override
	public void remove(String k) throws Exception {
		try {
		userDao.delete(k);
		}catch(Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("ID 없음");
			}
		}
	}

	@Override
	public void modify(BankUserDTO v) throws Exception {
		try {		
		userDao.update(v);
		}catch(Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("ID 없음");
			}	
		}
	}

	@Override
	public BankUserDTO get(String k) throws Exception {
		BankUserDTO obj = null;
		try {
		obj = userDao.select(k);
		}catch(Exception e){
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("ID 없음");
			}
		}
		return obj;
	}

	@Override
	public List<BankUserDTO> get() throws Exception {
		List<BankUserDTO> list = null;
		try {
		list = userDao.select();
		} catch(Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("데이터 없음");
			}
		}
		return list;
	}
}
