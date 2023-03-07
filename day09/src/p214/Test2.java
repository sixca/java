package p214;

import java.util.Scanner;

public class Test2 {
//예외처리(Exception) 예시
	public static void main(String[] args) {		
		int num=0;
		try (Scanner sc = new Scanner(System.in)){		// 정상이건 예외건 sc.close(); 기능이 포함되어 있음
			System.out.println("Input num...");
			num = Integer.parseInt(sc.next());			
			int result = 10 / num;
			System.out.println(result);
		}catch(Exception e) {							//어떠한 Exception이 발생해도 잡아준다
			System.out.println("잘못 입력했습니다.");
		}
			System.out.println("End App........");			
		}
}
