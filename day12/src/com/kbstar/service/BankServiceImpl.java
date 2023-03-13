/**
 * 
 */
package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dao.TransactionDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

/**
 * @author TerryK
 *
 */
public class BankServiceImpl 
implements BankService<UserDTO, AccountDTO, TransactionDTO, String, String> {

	DAO<String, UserDTO> userDao;
	DAO<String, AccountDTO> accountDao;
	Notification notification;
	DAO<String, TransactionDTO> TransactionDao;
	
	public BankServiceImpl() {
		userDao = new UserDAO();
		accountDao = new AccountDAO();
		TransactionDao = new TransactionDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		try {
			userDao.insert(v);
		}catch(Exception e) {
			throw new Exception("등록 오류");
		}
		notification.sendEmail(v.getEmail(), "축하 합니다");
		notification.sendSMS(v.getContact(), "축하 합니다");
	}

	@Override
	public UserDTO logIn(String k, String p) throws Exception {
		//사용자는 화면에서 아이디 패스워드를 입력했다> 맞으면 정보전송 > 틀리면 실패
		UserDTO user = null;  // 전제조건이여
		user = userDao.select(k);   //유저는 k아이디값에 해당하는 유저정보
		if (user != null) {
			if(user.getPwd().equals(p)) {
				System.out.println("OK");
			}else {
				throw new Exception("로그인 실패");
			}
			
		}else {
			throw new Exception("로그인 실패");
		}
		return user;
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		UserDTO user = null;
		user = userDao.select(k);		
		return user;
	}

	@Override
	public void makeAccount(String k, double balance) throws Exception {
		String accNo = MakeAccountNumber.makeAccNum();
		AccountDTO account = 
		new AccountDTO(MakeAccountNumber.makeAccNum(), balance, k);
		accountDao.insert(account);
		UserDTO user = userDao.select(k);    //사용자의 이메일과 전화번호가 필요하다    
		notification.sendEmail(user.getEmail(), accNo + "계좌를 생성 하셨습니다");
		notification.sendSMS(user.getContact(), accNo + "계좌를 생성 하셨습니다");
	}

	@Override
	public List<AccountDTO> getAllAccount(String k) throws Exception {
		List<AccountDTO> list = null;
		list = accountDao.search(k);
		return list;
		//return accountDao.search(k);로 한줄로 끝 가능!
	}

	@Override
	public List<TransactionDTO> getAllTransaction(String acc) throws Exception {
		return TransactionDao.search(acc);
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
		TransactionDTO tr = new TransactionDTO(MakeAccountNumber.makeTrNum(), sendAcc, balance, "O", desc);
		TransactionDao.insert(tr);
		// 완료
		String uid = acc.getHolder();
		UserDTO u = userDao.select(uid);
		notification.sendEmail(u.getEmail(), sendAcc + "계좌에서" + balance + "원이 출금되었습니다.");
		notification.sendSMS(u.getContact(), sendAcc + "계좌에서" + balance + "원이 출금되었습니다.");
		
	}

}
