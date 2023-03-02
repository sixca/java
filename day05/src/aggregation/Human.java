package aggregation;

public class Human {   // 사람은 이름이 있고, 차를 가지고 있다
	private String name;
	private Car car;
	public Human() {
	}
	
	public Human(String name) {
		this.name = name;
	} // 차가 없는 경우

	public Human(String name, Car car) {
		this.name = name;
		this.car = car;
	}

	@Override   // 우리가 보는 용도로 배열로 찍음. 이렇게 해놔야 App에서 sysoutprint했을 때 배열의 형태로 출력해줌. 
	public String toString() {
		return "Human [name=" + name + ", car=" + car + "]";
	}
	//	게터세터를 만들어서 특정 파일을 가져가게 됩니다
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}	
	//
	public void drive() {
		car.go();
	} // 사람이 drive()하면 car는 go()한다
	public void stopCar() {
		car.stop();
	} // 사람이 stopCar()하면 car는 stop()한다
	
}
