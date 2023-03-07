package inherit2;

import java.util.Date;

public class App3 {
	public static void main(String[] args) {
		//객체생성자 기본문법     '모' = '자'  자는 모이다. 
		Employee e1 = new Employee();
		Employee e2 = new Manager();
		Employee e3 = new Sales();
		// 자바 모든 클래스에서는 'extends Object'가 생략 되어있다.
		Object obj1 = new Employee();
		Object obj2 = new Manager();
		Object obj3 = new Date();
	}
	
}
