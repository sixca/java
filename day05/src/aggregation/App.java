package aggregation;

public class App {

	public static void main(String[] args) {
		Human human = new Human("james");
		System.out.println(human);

		Car car = new Car("K1", "red", 1000);
		human.setCar(car);
		System.out.println(human);
		
		human.drive();
		human.stopCar();
	}

}
