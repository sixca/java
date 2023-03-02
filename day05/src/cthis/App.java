package cthis;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee("권현진", 1200);
		System.out.println(e);
		Employee e2 = new Employee("권민희", 1300);
		System.out.println(e2);
		
		Date d = new Date();
		java.sql.Date dd = new java.sql.Date(0);
		// 같은 이름의 클래스를 두개 이상 import해서 쓸 수는 없음. 그래서 아래 sql은 경로를 다 적어서 떙겨옴
	}

}
