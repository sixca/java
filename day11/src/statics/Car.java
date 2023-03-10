package statics;

public class Car {
	private String name;
	private String maker;
	public static String makerName = "HD"; // 객체가 생설될 때 관여하지 않는다 static //static 필드는 해당클래스가 소유하고 있는 개념
	//같은 프로젝트 안에서라면, 어떤 곳에서도 이 클래스의 이 함수(스태틱함수,메서드 등등)를 쓸게! 가 된다 car.함수  car.함수() 이렇게 바로 사용 되지요
	public Car() {
	}

	public Car(String name) {
		this.name = name;
	}

	
	
	public Car(String name, String maker) {
		this.name = name;
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", maker=" + maker + "]";
	}
	
}
