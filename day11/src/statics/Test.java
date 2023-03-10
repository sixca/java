package statics;

public class Test {

	public static void main(String[] args) {
		Car c1 = new Car("k1", "kia");
		System.out.println(c1);
		
		Car c2 = new Car("g10", Car.makerName);
		System.out.println(c2);
	}

}
