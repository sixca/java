package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.AccountDaoImpl;
import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;

public class AccountCRUDService implements CRUDService<String, AccountDTO> {

	DAO<String, String, AccountDTO> accDao;

	public AccountCRUDService() {
		accDao = new AccountDaoImpl();
	}

	@Override
	public void register(AccountDTO v) throws Exception {
		try {
			String accNo = MakeAccountNumber.makeAccNum();
			v.setAccNo(accNo);
			accDao.insert(v);
		} catch (Exception e) {
			if (e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("계좌 중복");
			} else {
				throw new Exception("시스템 장애");
			}
		}
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			accDao.delete(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("계좌 없음");
			}
		}

	}

	@Override
	public void modify(AccountDTO v) throws Exception {
		try {
			accDao.update(v);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("계좌 없음");
			}
		}
	}

	@Override
	public AccountDTO get(String k) throws Exception {
		AccountDTO acc = null;
		try {
			acc = accDao.select(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("계좌 없음");
			}
		}
		return acc;
	}

	@Override
	public List<AccountDTO> get() throws Exception {
		List<AccountDTO> list = null;
		try {
			list = accDao.select();
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("데이터 없음");
			}
		}
		return list;
	}
}
