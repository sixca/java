package oop1;

public class Car {
	//속성
	public String name;
	public String color;
	public int size;
	
	//생성자 (constructor)
	public Car() {
		this.name = "k1";
		this.color = "red";
		this.size = 1000;
	}
	public Car(String name, String color, int size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}
	//오버로딩, 매개변수 명은 같지만 객체타입이 달라서 다른 것으로 인식
	
	//행위
	public void go() {
		System.out.printf("%s, %s Go car...", this.name, this.color);
	}
	public void stop() {
		System.out.println(this.name + " Stop Car..");		
	}
}
