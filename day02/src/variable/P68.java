package variable;

import java.util.Random;

public class P68 {

	public static void main(String[] args) {
		String s1 = "10";
		System.out.println(s1 + 10); // 1010, 문자열과 정수를 더하면 정수를 문자열로 바꾸는 것

		String s2 = "10";
		int a = 10;
		System.out.println(s2 + a); // 1010

		int s3 = Integer.parseInt(s2); // JDK 안에 있는 API인 integer.parseInt 사용
		int b = 10;
		System.out.println(s3 + b); // 20, s2를 int인 s3로 바꾸니 연산 가능

		int n1 = 10;
		String n2 = String.valueOf(n1);
		System.out.println(n2 + "억"); // 10억, n1을 string으로 안 바꿔줘도 값은 같겠지

		Random r = new Random();
		int rndNum = r.nextInt(10);    // 10까지 래덤수?
		System.out.println(rndNum);    //import 넣기, java doc가서 찾아보기 예제
	}

}
