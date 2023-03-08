package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class App2 {

	public static void main(String[] args) throws Exception {
 
		DAO<Integer, ItemDTO> itemDao = new ItemDAO(); 
		// DAO인터페이스를 구현하는 ItemDAO클래스의 객체를 생성하고 itemDao변수에 할당.. 키는 Integer, 값은 ItemDTO를 사용하도록 구현됨
		// itemDao변수로 DAO인터페이스의 메서드를 호출하지
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input command(q,i,d,u,s,sa)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			} else if (cmd.equals("i")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input NAME...");
				String name = sc.next();
				System.out.println("Input PRICE...");
				double price = Double.parseDouble(sc.next());
				System.out.println("Input QUANTITY...");
				int qt = Integer.parseInt(sc.next());
				ItemDTO item = new ItemDTO(id, name, price, qt);
				try {
					itemDao.insert(item);
					System.out.println("Inserted..");
				} catch (Exception e) {
					System.out.println("같은 상품ID가 존재합니다");
				}
			} else if (cmd.equals("d")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				try {
					itemDao.delete(id);
					System.out.println("Deleted..");
				} catch (Exception e) {
					System.out.println("상품 id가 존재하지 않습니다");
				}
			} else if (cmd.equals("u")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input NAME...");
				String name = sc.next();
				System.out.println("Input PRICE...");
				int qt = Integer.parseInt(sc.next());
				System.out.println("Input QUANTITY...");
				double price = Double.parseDouble(sc.next());
				ItemDTO item = new ItemDTO(id, name, price, qt);
				try {
					itemDao.update(item);
					System.out.println("Updated..");
				} catch (Exception e) {
					System.out.println("상품 id가 존재하지 않습니다");
				}
			} else if (cmd.equals("s")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				ItemDTO item = null; // 받을 준비요
				try {
					item = itemDao.select(id);
					System.out.println(item);
				} catch (Exception e) {
					System.out.println("상품 id가 존재하지 않습니다");
				}
			} else if (cmd.equals("sa")) {
				List<ItemDTO> list = null; // 받을 준비 하시고요
				try {
					list = itemDao.select();
					for (ItemDTO u : list) {
						System.out.println(u);
					}
				} catch (Exception e) {
					System.out.println("입력된 상품정보가 없습니다");
				}
				
			}
		}
		sc.close();
	}

}
