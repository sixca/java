package variable;

import java.util.Random;
import java.util.Scanner;

public class P74 {
//직접 작성해보기. 논리구조파악 후 코드작성.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   //값을 입력받아 사용하는 Scanner
		System.out.println("숫자를 입력하슈(10~100)");
		String cmd = sc.next();
		// 10~100 사이의 정수를 입력 받는다.
		// 1부터 입력 받은 숫자까지의 범위에서 랜덤한 숫자를 발생 하시오
		Random r = new Random();
		int num = Integer.parseInt(cmd);
		int rndNum = r.nextInt(num)+1;
		System.out.println(rndNum);
		sc.close();
		
		
		//내가 한거.. 실패
		/*int new_cmd = new int(cmd)
		Random r = new Random();
		int rndNum = r.nextInt(new_cmd);
		System.out.println(rndNum);
		sc.close();*/				
	}
}