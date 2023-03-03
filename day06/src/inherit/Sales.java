package inherit;

public class Sales extends Employee {
	private String loc;
	private double rate;
	public Sales() {
	}
	
	public Sales(String id, String name, double salary) {
		super(id, name, salary);
		
	}  // 기본 Employee constructor

	public Sales(String id, String name, double salary, String loc, double rate) {
		super(id, name, salary);
		this.loc = loc;
		this.rate = rate;
	} // Employee constructor를 포함한 Sales constructor

	@Override
	public String toString() {
		return super.toString()+" "+loc+" "+rate;
	}

	@Override
	public double getAnnSalary() {
		double result = 0.0;
		result = super.getAnnSalary() + (this.getIncentive()*12);
		return result;
	}  //모의 메서드와 자의 메서드 같이 사용한 사례
	
	public double getIncentive() {
		double result = 0.0;
		result = getSalary() * this.rate;
		return result;
	}

}
