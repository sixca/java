package p214;

import java.util.Scanner;

public class Test {
//예외처리(Exception) 예시
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num...");
		int num=0;
		try {											// 정상일 경우 실행한다
			num = Integer.parseInt(sc.next());			
			int result = 10 / num;
			System.out.println(result);
		}
		//case.1
		catch(ArithmeticException e1) {				// Arithmetic예외인 경우 catch하여 처리하라. e1을 실행하라 == "분모가 0입니다"
		System.out.println("분모가 0입니다");
		return;  // 을 해버리면 여기서 끝나버리고 뒷라인 실행 안 됨.
		//e1.printStackTrace(); 오류, 예외 확인하기
		}catch(NumberFormatException e2) {
			System.out.println("숫자를 입력하세요");			// NumberFormat예외인 경우 catch하여 처리하라. e2을 실행하라 == "분모가 0입니다"
		return;
		}finally { 										// return값들 때문에 위에서 종료되더라도 finally는 예외없이 실행. sc.close();를 실행해줄 수 있음. 이거 안 써서 시스템 뻑나갈 수 있다. 대단히 중요합니데이
			System.out.println("반드시 실행........");
			sc.close();
		}
		
		//case.2
//		catch(ArithmeticException | NumberFormatException e3) {
//			System.out.println("잘못 입력했습니다");			// or로 한번에 두가지 예외상황 처리
//		}
//		
		//case.3   예외클래스의 상속구조로 이렇게 퉁치기도.. 하지만 세부적인 어떤 오류인지 표시할 수 없으니 case.1으로 하는게 일반적
//		catch(Exception e) {
//			System.out.println("잘못 입력했습니다");
//		}
		sc.close();
		System.out.println("End Application....");
	}

}
