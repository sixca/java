
package com.kbstar.service;

import java.util.Date;
import java.util.List;

import com.kbstar.dao.AccountDaoImpl;
import com.kbstar.dao.BankUserDaoImpl;
import com.kbstar.dao.TransactionDaoImpl;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.BankUserDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;

public class BankServiceImpl implements BankService<BankUserDTO, AccountDTO, TransactionDTO, String, String> {

	DAO<String, String, BankUserDTO> userDao;
	DAO<String, String, AccountDTO> accountDao;
	DAO<String, String, TransactionDTO> transactionDao;

	public BankServiceImpl() {
		userDao = new BankUserDaoImpl();
		accountDao = new AccountDaoImpl();
		transactionDao = new TransactionDaoImpl();
	}

	@Override
	public void register(BankUserDTO v) throws Exception {
		try {
			userDao.insert(v);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("등록 오류");

		}
	}

	@Override
	public BankUserDTO logIn(String k, String p) throws Exception {
		BankUserDTO user = null;
		user = userDao.select(k);
		if (user != null) {
			if (user.getPwd().equals(p)) {
				System.out.println("OK");
			} else {
				throw new Exception("로그인 실패");
			}

		} else {
			throw new Exception("로그인 실패");
		}
		return user;
	}

	@Override
	public void makeAccount(String k, double balance) throws Exception {
		String accNo = MakeAccountNumber.makeAccNum();
		AccountDTO account = new AccountDTO(MakeAccountNumber.makeAccNum(), balance, k);
		try {
			accountDao.insert(account);
		} catch (Exception e) {
			throw new Exception("등록 오류");
		}
	}

	@Override
	public List<AccountDTO> getAllAccount(String k) throws Exception {
		List<AccountDTO> list = null;
		list = accountDao.search(k);
		return list;
	}

	@Override
	public List<TransactionDTO> getAllTransaction(String accNo) throws Exception {
		List<TransactionDTO> list = null;
		list = transactionDao.search(accNo);
		return list;
	}

	@Override
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception {
		System.out.println("금결원 전송...");
		// 계좌 잔액 정보를 조회하고 잔액에서 이체하는 금액을 차감한 잔액으로 수정
		AccountDTO acc = null;
		acc = accountDao.select(sendAcc);
		double abalance = acc.getBalance() - balance;
		acc.setBalance(abalance);
		accountDao.update(acc);
		// 거래 내역 추가
		TransactionDTO tr = new TransactionDTO(MakeAccountNumber.makeTranNum(), null, sendAcc, balance, "O", desc);
		transactionDao.insert(tr);
		// 완료
	}

}
