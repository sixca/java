package cal;

public class Cal {
	public static double div(int a, int b) throws Exception {    //CalUl 실행
		double result = 0.0;
		try {
		result = a / b;
		}catch(Exception e) {
			throw e;					// CalUl을 실행하면 ArithmeticException이 발생하는데 예외 발생 위치는 Cal.java의 7열이다
		}								// 그래서 예외상황 발생 시 던져주라는 의미의 throw e;로 calUl.java에 Exception이 발생한 것을 알려준다
		return result;
	}
	public static double div(double a, double b) throws Exception {    //CalUl2 실행
		double result = 0.0;
		if(b == 0.0) {
			throw new InfinityException("B0001");          //여기서 던지고 마는것. 아래쪽은 실행 안 됨
		}
		result = a / b;
		return result;		
	}
}
