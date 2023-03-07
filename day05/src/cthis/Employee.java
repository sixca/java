package cthis;

import java.util.Calendar;

/// this키워드 와 this() 메서드
public class Employee {
	private String id;            //private는 외부에서 가져와서 쓸 수 없게 캡슐화
	private String name;
	private int salary;
	public Employee() {
		Calendar cal = Calendar.getInstance();
		this.id = "" + cal.get(Calendar.YEAR)+cal.get(Calendar.MILLISECOND);   //""+는 int로 변환하기 위해넣어줌. intvalueOF로 해도되고.. 
	}  
	
	
	
	public Employee(String name, int salary) {
		this();  //Employee() 가져오기
		this.name = name;
		this.salary = salary;
	}   //id는 자동생성하고자 빼고, this(); 메서드로 상위 Employee(); 를 데리고 옴. 중복제거용.



	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// private 함수를 다른 패키지에서 갖다 쓰기 위해서, getter and setter 를 만든다. get/set을 허용비허용하면서 인아웃을 조절하는 거지.
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
	// getter, setter 끝
	
	
	public double getTax() {
		double result = 0.0; // 0.0 넣은건 초기화
		result = this.salary * 0.17;    //this는 생략가능하나 명확히 지정하며 구조 파악
		return result;		
	}
	public int getAnnSalary() {
		int result = 0;
		result = this.salary*12;
		return result;
	}
	public double getAnnTax() {
		double result = 0.0;
		result = this.getAnnSalary() * 0.17;
		return result;
	}
	@Override   //필드 초기화  :: 어떻게 배열할지.. 이 클래스에서는 출력 시 정보들을 이렇게 배열하겠다
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
