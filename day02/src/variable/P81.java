package variable;

import java.util.Scanner;

public class P81 {

	/*public static void main(String[] args) {
	//그냥 self 학점 계산기	
		Scanner sc = new Scanner(System.in);
		System.out.println("학점을 입력 하시오(80~100)");
		String cmd = sc.next();
		System.out.printf("%s점이라고요?\n", cmd);
		
		int credit = Integer.parseInt(cmd);
		String grade = (credit >= 90)? "High군요":"Low네요";
		System.out.println(grade);
	
		sc.close();

	}*/
	//수업 과제 작성
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Input Number..");
			int num = Integer.parseInt(sc.next());
			String result = (num > 0)? "정상":"비정상";
			System.out.println(result);
			sc.close();  // 항상 사용하고 나서는 클로스해달라
 }
}
//Scanner 클래스에서 nextLine(), nextInt(), nextDouble() 메소드를 살펴 보았다. 각각 메소드에 맞게 알맞는 데이터 타입의 값으로 리턴해준다. 