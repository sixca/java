package inherit2;

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
	}
	////// 모 클래스인 Employee에 getIncentive메서드를 깡통으로 만들어놓는다면, Sales클래스에서 아래와같이 오버라이드로 구현할 수 있다.
	// App2에보면 em.getIncentive()로 바로 꺼내 씀. em instanceof Sales 로 타입변환 안해도 되지ㅋ
	@Override
	public double getIncentive() {
		double result = 0.0;
		result = getSalary() * this.rate;
		return result;
	}

}
