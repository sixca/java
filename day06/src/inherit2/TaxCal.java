package inherit2;

public class TaxCal {
	public double getTax(Employee e) {    //최상위 모클래스의 객체를 지정함으로서 하위클래스 객체들까지 사용가능 :: Manager, Sales 다 델꼬오지
		double result = 0.0;
		result = e.getAnnSalary() * 0.17;
		return result;
	}
}
