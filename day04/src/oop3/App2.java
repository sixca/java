package oop3;

import oop2.Employee;

public class App2 {

	public static void main(String[] args) {
		Car car = new Car("BenzG63amg", "red", 1000, 50);
		System.out.println(car.toString());

		car.go(5);
		car.setCfsize(0);
		car.setCfsize(51);
		car.setCfsize(25);
		car.go(0);
		car.go(100);
		System.out.println(car.toString());
		System.out.println("");
		car.go(200);
		System.out.println(car.toString());

	}

}
