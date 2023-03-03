package inherit;

public class App2 {
	public static void main(String[] args) {

		// Manager is a Employee
		Employee e = new Manager("100", "james", 500, 50);
//	Manager m = new Employee("100", "james", 550); 불가

		Employee ea[] = new Employee[5];
		ea[0] = new Employee("100", "james", 500);
		ea[1] = new Employee("101", "james", 500);
		ea[2] = new Manager("102", "james", 500, 50);
		ea[3] = new Manager("103", "james", 500, 50);
		ea[4] = new Sales("104", "james", 500, "Seoul", 0.35);
		
		for (Employee em : ea) {
			System.out.println(em);
			System.out.println(em.getAnnSalary());
			//em은 Employee 타입으로 Sales 메서드를 가져올 수 없는 상황. 그러면 직접 끄집어내 줘야겠지.
			if(em instanceof Sales) {
				Sales s = (Sales)em;
				System.out.println(s.getIncentive());
			}
		} // Employee 객체타입 em이 Sales 객체로 캐스팅이 된다면 Sales = s로 바꿔 쓰겠다.
			//Sales 객체로 바꿔서 getIncentive()메서드를 사용하겠다.
	}
}
