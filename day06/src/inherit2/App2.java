package inherit2;

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
			System.out.println(em.getIncentive());
		} // Sales클래스에 getIncentive메서드를 @override하여 간단하게 출력한 케이스. 
		System.out.println("-----------");
		TaxCal t = new TaxCal();
		double result = t.getTax(ea[4]);
		System.out.println(result);
		// TaxCal 클래스를 하나 만듬으로써, 상위클래스의 하위클래스 객체들까지 모두 담을 수 있다. Employee e = new Manager(); 와 같은 개념.
	}
}
