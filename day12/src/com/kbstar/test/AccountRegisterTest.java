package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountService;

public class AccountRegisterTest {

	public static void main(String[] args) {
		CRUDService<String, AccountDTO> service = new AccountService();
		AccountDTO obj = new AccountDTO("acc", 10000, "이순식");
		AccountDTO obj2 = new AccountDTO("acc2", 10000, "이순식2");
		AccountDTO obj3 = new AccountDTO("acc3", 10000, "이순식3");
		// insert
		try {
			service.register(obj);
			service.register(obj2);
			service.register(obj3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		// get all
		List<AccountDTO> list = null;
		try {
			list = service.get();
			for (AccountDTO acc : list) {
				System.out.println(acc);

			}
		} catch (Exception e) {
			System.out.println("입력된 상품정보가 없습니다");
		}
		System.out.println("---------");

		// get k
		AccountDTO acc = null;
		try {
			acc = service.get("acc3");
			System.out.println(acc);
			System.out.println("acc3 계좌정보 출력 완료");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		System.out.println("---------");

		// remove
		try {
			service.remove("acc2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Remove done");
	}

	// modify

	// AccountDTO acc = new AccountDTO("acc0", 50000, "김순식")
	// acc = service.update("acc3");

}
