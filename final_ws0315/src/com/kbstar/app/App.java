package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dao.TransactionDaoImpl;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.BankUserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountCRUDService;
import com.kbstar.service.BankServiceImpl;
import com.kbstar.service.BankUserCRUDService;
import com.kbstar.service.TransactionCRUDService;

public class App {

	public static void main(String[] args) {
		BankService<BankUserDTO, AccountDTO, TransactionDTO, String, String> service;
		service = new BankServiceImpl();
		CRUDService<String, BankUserDTO> userService =
				new BankUserCRUDService();
		CRUDService<String, AccountDTO> accountService =
				new AccountCRUDService();
		CRUDService<String, TransactionDTO> TrasactionService =
				new TransactionCRUDService();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			BankUserDTO user = null;
			AccountDTO acc = null;
			System.out.println("Login(l) or Register(r) (q)...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				break;
			}else if(cmd.equals("r")) {
				System.out.println("Register..id, pwd, name, email, contact!");
				String id = sc.next();
				String pwd = sc.next();
				String name = sc.next();
				String email = sc.next();
				String contact = sc.next();
				user = new BankUserDTO(id, pwd, name, email, contact);
				try {
					service.register(user);
					System.out.println("환영합니다");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}				
			}else if(cmd.equals("l")) {
				System.out.println("Login..id, pwd!");
				String id = sc.next();
				String pwd = sc.next();
				user = null;
				try {
					user = service.logIn(id, pwd);                 //로그인 성공 시 해당 객체 루프 안에서 지속 사용
					System.out.println(user);
					System.out.println("로그인 성공");
					System.out.println("-------------");
					//로그인이 됐으면, 계좌개설/이체/조회 해야죠. 
					//while loop 안에서 while loop 한번 더!
					while(true) {
						System.out.println("Menu(m,t,a,i,tr,e)...");
						String cmn = sc.next();
						if(cmn.equals("e")) {
							break; //로그아웃 exit
						}else if(cmn.equals("m")) {
							System.out.println("Make Account... balance입력하세요");
							double balance = Double.parseDouble(sc.next()); //id, pwd는 루프 안에 객체저장 되어 있으니 balance만 추가받음
							acc = new AccountDTO(null, balance, user.getId());
							accountService.register(acc);
							System.out.println("make Account Completed...");
						}else if(cmn.equals("t")) {
							System.out.println("Transaction...보낼계좌,받을계좌,보낼금액,기재내용 입력!");
							String sendAcc = sc.next();
							String receiveAcc = sc.next();
							double balance = Double.parseDouble(sc.next());
							String desc = sc.next();
							service.transaction(sendAcc, receiveAcc, balance, desc);
							System.out.println("Transaction Completed...");
						}else if(cmn.equals("a")) {  // 계좌목록
							System.out.println("Select Account...");
							List<AccountDTO> list = null;
							service.getAllAccount(user.getId());
							for(AccountDTO accList :list) {
								System.out.println(accList);
							}
						}else if(cmn.equals("i")) {
							System.out.println("User Info..");
							String rid = user.getId();
							BankUserDTO ruser = null;
							ruser = userService.get(rid); 
							System.out.println(ruser);
						}else if(cmn.equals("tr")) {    // 내 계좌의 거래내역
							System.out.println("Select Transaction...accNo입력!");
							String accNo = sc.next();
							List<TransactionDTO> list = null;
							list = service.getAllTransaction(accNo);
							for (TransactionDTO tr:list) {
								System.out.println(tr);
							}
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());				}
			}
		}
		sc.close();
	}

}
