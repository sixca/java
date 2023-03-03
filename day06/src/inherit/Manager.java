package inherit;

public class Manager extends Employee{
	private double bonus;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String id, String name, double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}
	// constructor는 상속하는게 아니고, 모에 있는 것을 사용한다

	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override //함수의 재정의(overriding) :: 상위의 있는 함수를 덮어쓴다.
	public double getAnnSalary() {
		
			double result = 0.0;
			result = (this.getSalary() + this.bonus) * 12;
//			result = super.getAnnSalary() + (this.bonus *12);
			return result;
	}

	@Override
	public String toString() {
		return super.toString() + " " + bonus;
	}

}
