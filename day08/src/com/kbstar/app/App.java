package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;
import com.kbstar.service.UserService;

public class App {

//	public static void main(String[] args) {
//		Service<String, UserDTO> service = new UserService();   //한줄로 쓰기
//		UserDTO user = new UserDTO("id01", "pwd01", "james");    //id, pw, name 객체를 받으셨다면~ 이걸로 UserDTO 객체를 만들겠다
//		service.register(user);
//	}

	public static void main(String[] args) {
		// App 개발자들은 DAO 인터페이스만 보고 개발을 하겠지. 종속 클래스들은 볼 필요가 없음
		Service<String, UserDTO> service = new UserService();  // search 기능을 interface에 넣으면 이렇게 선언하고 써야 
		SearchService search = new UserService();   // 인터페이스를 따로 만들었으니 이렇게 기능을 사용할수도있음
		//UserService service = new UserService();   // search 기능을 UserService에 넣으면 이렇게 선언하고 써야
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input command(q,i,d,u,s)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}//else if(cmd.equals("s")) 
				//service.search(); }
			else if (cmd.equals("i")) {
				// id pw name 입력 로그인
				System.out.println("Input ID...");
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input NAME...");
				String name = sc.next();
				// DTO를 생성해서 아 객체를 통해 정보들을 한꺼번에 보내버릴거다
				UserDTO user = new UserDTO(id, pwd, name);
				service.register(user);
			} else if (cmd.equals("d")) {
				// d를 입력하고, id(글번호)를 넣으면 정보가 삭제되도록
				System.out.println("Input ID...");
				try{
					String id = sc.next();
					service.remove(id);
				}catch(Exception e) {
					System.out.println("잘못 입력 하셨습니다.");
				}
				
			} else if (cmd.equals("u")) {
				// id, pw, name 입력받고, 수정부분 있으면 적용
				System.out.println("Input ID...");
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input NAME...");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				service.modify(user);
			}
		}
		sc.close();
	}

}
