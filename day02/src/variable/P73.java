package variable;

import java.util.Scanner;

public class P73 {

	public static void main(String[] args) {
		int a = c;
		Scanner sc = new Scanner(System.in);
		System.out.println("명령어를 입력 하시오(q,i,d,s)");
		String cmd = sc.next();
		System.out.printf("%s를 입력 했습니다.", cmd);
		sc.close();  // 어플이 파이프로 os와 연결되어있을 때는 close 해줘야 한다
	}

}
