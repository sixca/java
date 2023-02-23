package variable;

import java.util.Scanner;

public class P82 {
//실습과제 if-else문을 삼항연산자로 변환하라 !복수조건!
	public static void main(String[] args) {
		
		int score = 79;
		String grade = (score >= 90)? "A" : (score >= 80)? "B" : "F";
		
		System.out.println(grade);
				
 }
}