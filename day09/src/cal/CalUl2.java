package cal;

import java.util.Scanner;

public class CalUl2  {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 Number");
		double a = Double.parseDouble(sc.next()); 
		double b = Double.parseDouble(sc.next());		
		double result = 0.0;
	
		try {
			result = Cal.div(a, b);
		} catch (Exception e) {
			System.out.println(e.getMessage());  // getMessage(): 예외발생시킬 때 생성자 매개값으로 사용한 메시지 리턴 p229
		}
	
		System.out.println(result);
		sc.close();
	}
}
