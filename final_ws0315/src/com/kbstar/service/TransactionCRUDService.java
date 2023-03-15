package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.TransactionDaoImpl;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;

public class TransactionCRUDService implements CRUDService<String, TransactionDTO>{

	DAO<String, String, TransactionDTO> transDao;
	
	public TransactionCRUDService() {
		transDao = new TransactionDaoImpl();
	}

	@Override
	public void register(TransactionDTO v) throws Exception {
		try {
			String id = MakeAccountNumber.makeTranNum();
			v.setId(id);
			transDao.insert(v);
		}catch(Exception e) {
			if (e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("장바구니ID가 중복 되었습니다.");
			} else {
				throw new Exception("시스템 장애 입니다.");
			}
		}
	}

	@Override
	public void modify(TransactionDTO v) throws Exception {
	}

	@Override
	public TransactionDTO get(String k) throws Exception {
		TransactionDTO obj = null;
		try {
			obj = transDao.select(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("거래내역 없음");
			}
		}
		return obj;
	}
	
	@Override
	public List<TransactionDTO> get() throws Exception {
		List<TransactionDTO> list = null;
		try {
			list = transDao.select();
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("데이터 없음");
			}
		}
		return list;
	}

	@Override
	public void remove(String k) throws Exception {
	}
}
