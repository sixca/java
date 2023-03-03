package inherit;

/*
 '자'에서 '모'의 필드나 메서드를 사용하다가 덮어쓰기를 위해선 Overriding 필요
 오버라이딩을 위해서는 필드는 접근자를 protected로 하거나(protected는 상속 시 가능)
 '모'에서 getter메서드를 생성한 후 getter메서드를 가져와서 출력값을 '자'클래스에서 쓸 수 있따  
 */


public class App {

	public static void main(String[] args) {
		Employee e = new Employee("100", "james", 500);
		System.out.println(e);
		System.out.println(e.getAnnSalary());

		Manager m = new Manager("200", "kim", 500, 50);
		System.out.println(m);
		System.out.println(m.getAnnSalary());
		
		
	}

}
