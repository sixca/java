package oop3;

public class Car {
	private String name;
	private String color;
	private int size; // 배기량
	private int fsize; // 기름통
	private int cfsize; // 현재 기름양

	public Car() {
	}

	public Car(String name, String color, int size, int fsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;
	}

	public Car(String name, String color, int size, int fsize, int cfsize) {
		this(name, color, size, fsize);
		this.cfsize = cfsize;
	}

	@Override  // 우클릭-source-generate ToString()... 활용
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", fsize=" + fsize + ", cfsize=" + cfsize
				+ "]";
	}

	// 기름을 넣는다.
	// 기름통을 넘치는양이나 음수값은 입력할수 없음
	public void setCfsize(int size) {
		if (size <= 0) {
			System.out.println("0 또는 음수값을 주유할 수 없습니다.");
			System.out.println("현재 기름의 양: " + cfsize + " 기름통의 크기: " + fsize);
			System.out.println("다시 주유하세요");
		} else if (cfsize + size > fsize) {
			System.out.println("기름통을 초과하는 양을 주유할 수 없습니다.");
			System.out.println("현재 기름의 양: " + cfsize + " 기름통의 크기: " + fsize);
			System.out.println("다시 주유하세요");
		} else {
			cfsize += size;
			System.out.println("주유를 완료했습니다.");
			System.out.println("현재 기름의 양: " + cfsize + " 기름통의 크기: " + fsize);
		}
		System.out.println("");
	}

	// 주행을 한다.
	// 1리터당 10km를 주행 할 수 있다.
	public void go(int distance) {
		if (cfsize == 0) {
			System.out.println("주유하고 출발하세요");
			return;
		}
		System.out.printf("%s %d Km Go...\n", this.name, distance);
		int i = 0;
		for (i = 0; i < distance / 10; i++) {
			if (cfsize == 0) {
				System.out.println("기름이 다 떨어졌다!");
				break;
			}
			cfsize--;
		}
		System.out.println("총 주행거리는 " + i * 10 + "km입니다.");
		this.stop();
	}

	// 멈춘다.
	public void stop() {
		System.out.printf("%s Stop...\n", this.name);
		System.out.println("");
	}

}