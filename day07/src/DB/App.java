package DB;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//App 개발자들은 DAO 인터페이스만 보고 개발을 하겠지. 종속 클래스들은 볼 필요가 없음
		DAO dao = new MariaDBDAO(); //여길 바꾸면서 OracleDAO 클래스를 탑재할지, MariaDB를 탑재할지 고를 수 있다
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input command(q,i,d,u)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("i")) {
				// id pw name 입력 로그인
				System.out.println("Input ID...");
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input NAME...");
				String name = sc.next();
				//DTO를 생성해서 아 객체를 통해 정보들을 한꺼번에 보내버릴거다
				UserDTO user = new UserDTO(id, pwd, name);
				dao.insert(user);				
			}else if(cmd.equals("d")) {
				// d를 입력하고, id(글번호)를 넣으면 정보가 삭제되도록
				System.out.println("Input ID...");
				String id = sc.next();
				dao.delete(id);
			}else if(cmd.equals("u")) {
				//id, pw, name 입력받고, 수정부분 있으면 적용
				System.out.println("Input ID...");
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input NAME...");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd,name);
				dao.update(user);	
			}
		}
		sc.close();
	}

}
