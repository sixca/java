package overloading;

public class Calculator {
	public int sum(int a, int b) {
		int result = 0;       //생략가능. 생서자 초기화 컴플라이어에서 자동생성
		result = a + b;		  
		return result;
	}
	public int sum(int a, int b, int c) {
		int result = 0;       
		result = a + b + c;		  
		return result;
	}
	public int sum(int a, int b, int c, int d) {
		int result = 0;       
		result = a + b + c + d;		  
		return result;
	}
}
