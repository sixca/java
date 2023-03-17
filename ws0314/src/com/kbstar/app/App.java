package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.ShopService;
import com.kbstar.service.CartCRUDServiceImpl;
import com.kbstar.service.CustCRUDServiceImpl;
import com.kbstar.service.ItemCRUDServiceImpl;
import com.kbstar.service.ShopServiceImpl;

public class App {

	public static void main(String[] args) {

		// register, login, mycart 기능을 담고있음
		ShopService<Cust, Cart> shopservice = new ShopServiceImpl();

		CRUDService<String, Cust> custservice = new CustCRUDServiceImpl();
		CRUDService<String, Item> itemservice = new ItemCRUDServiceImpl();
		CRUDService<String, Cart> cartservice = new CartCRUDServiceImpl();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----   Shop Mall Program -----");
			System.out.println("Login(l) or Register(r) (q) ...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye...");

				break;
			} else if (cmd.equals("r")) {
				System.out.println("Register.. ");
				System.out.println("Input ID.. ");
				String id = sc.next();
				System.out.println("Input PWD.. ");
				String pwd = sc.next();
				System.out.println("Input NAME.. ");
				String name = sc.next();
				Cust cust = new Cust(id, pwd, name, 20);
				try {
					shopservice.register(cust);
					System.out.println("환영합니다.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else if (cmd.equals("l")) {
				System.out.println("Login.. ");
				System.out.println("ID를 입력 하세요.. ");
				String id = sc.next();
				System.out.println("PWD를 입력 하세요.. ");
				String pwd = sc.next();
				Cust cust = null; // 로그인 성공 시 이 cust를 유지하기 위함 밑에서 cust.getid()해서 저장된 아이디를 계속 불러올거임

				try {
					shopservice.login(id, pwd);
					cust = shopservice.login(id, pwd);
					System.out.println("로그인 성공");
					System.out.println("----------------------------");
					while (true) {
						System.out.println("Menu(사용자정보조회(c),상품조회(it),카트입력(i),카트조회(ci),나가기(e))...");
						String cmn = sc.next();
						if (cmn.equals("e")) {
							System.out.println("Logout...");
							break;
						} else if (cmn.equals("c")) {
							System.out.println("사용자정보조회...");
							Cust custinfo = new Cust();
							custinfo = custservice.get(cust.getId());
							System.out.println(custinfo);
							// 해당 아이디에대한 사용자 정보를 cust에서 긁어오기
						} else if (cmn.equals("it")) {
							System.out.println("상품조회");
							List<Item> list = null;
							list = itemservice.get();
							for (Item item : list) {
								System.out.println(item);
							} // 전체 상품 조회니깐 List<Item> ok

						} else if (cmn.equals("i")) {
							System.out.println("카트입력");
							System.out.println("상품id입력");
							String item_id = sc.next();
							System.out.println("개수입력");
							int cnt = Integer.parseInt(sc.next());
							
							Cart cart = new Cart(cust.getId(), item_id, cnt);
							cartservice.register(cart);
							System.out.printf("Cart에 %s을 %d개 입력\n", item_id, cnt);
							
						} else if (cmn.equals("ci")) {
							System.out.println("카트조회...");
							List<Cart> list = null;
							list = shopservice.myCart(cust.getId());
							for (Cart cart : list) {
								System.out.println(cart);
							}
						}

					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		}
		sc.close();
	}

}
