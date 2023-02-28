package oop3;

public class Car {
	// 속성
	private String name;
	private String color;
	private int size;
	private int fsize; // 연료통 사이즈
	private int cfsize; // 현재 현료양

	// 생성자 (constructor)
	public Car() {

	}

	public Car(String name, String color, int size, int fsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;
	}

	public Car(String name, String color, int size, int fsize, int cfsize) {
		this(name, color, size, fsize); // 동일 constructor를 활용한 중복제거.(자기 클래스 내부의 다른 생성자 호출)
		this.cfsize = cfsize;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", fsize=" + fsize + ", cfsize=" + cfsize
				+ "]";
	}

	// 기름을 넣는다.
	// 기름통 보다 많이 넣으면 - 다시 주유 하세요
	// 음수 값이 들어가면 - 다시 주유 하세요

	public void setCfsize(int size) { // 여기서 size는 위에 차량 사이즈와는 별개
		
		if (size <= 0 || fsize < (cfsize+size)) {
			System.out.println("다시 주유 하세요");
			return;
		}
		cfsize += size;
		System.out.printf("현재 연료는 %s", cfsize);
		System.out.printf("주행가능 거리는 %skm", (cfsize*10));
	}


	// 주행을 한다.
	// 1리터당 10km를 주행할 수 있다.
	public void go(int distance) {
		if(cfsize > 0 || cfsize < distance/10) {
			System.out.println("주유 후 출발하세요");
			return;
		} 
		System.out.printf("%s %d go..", this.name, distance);	
		cfsize = cfsize - (distance/10);
		System.out.printf("남은 연로: %s", this.cfsize);
	}

	// 멈춘다.
	public void stop() {
		System.out.printf("%s stop...", this.name);

	}

}
