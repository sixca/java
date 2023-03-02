package access;

public class Employee {
	private String id;        //private            
	protected String name;    //protected
	int salary;               //default
	public Employee() {
	}
	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
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
	public double getTax() {
		double result = 0.0;
		result = this.salary * 0.17;    
		return result;		
	}
	private int getAnnSalary() {   //접근제어자 private으로 변경
		int result = 0;
		result = this.salary*12;
		return result;
	}
	protected double getAnnTax() {  //접근제어자 protected으로 변경
		double result = 0.0;
		result = this.getAnnSalary() * 0.17;
		return result;
	}
	@Override   //필드 초기화
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
