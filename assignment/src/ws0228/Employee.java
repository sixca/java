package ws0228;

import java.util.Random;

public class Employee {
	private String id;
	private String name;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public Employee() {
		this.id = "temp0001";
		this.name = "temp";
		this.salary = 10000000;
	}

	public Employee(String id, String name, int salary) {
		this.id = id; // 여기선this가 필수인 상황. this빼니깐 has no effect뜨네. 다른 곳에서는 다 this는 생략가능
		this.name = name;
		if (salary < 0) {
			this.salary = 0;
		} else {
			this.salary = salary;
		}
	}

	public Employee(String name, int salary) {
		this("10000", name, salary); // 위 employee 컨스트럭터를 호출. P143~144

	}

	public int getAnnSalary() {
		return this.salary * 12; // 만들어질 객체의 ~ 'this'
	}

	public double getTax() {
		return this.getAnnSalary() * 0.175;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
