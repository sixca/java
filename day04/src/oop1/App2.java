package oop1;

public class App2 {

	public static void main(String[] args) {
		
		Car car1 = new Car("k2","blue",2000);
		car1.go();
		car1.stop();
		System.out.println("-----------------");
		//오버로딩을 활용한 다른 Car 메서드를 사용한 것.
		Car car2 = new Car("k3","white",3000);
		car2.go();
		car2.stop();
		
		
		
		/*Car car2 = new Car();
		car2.go();
		car2.stop();
*/
	}

}
