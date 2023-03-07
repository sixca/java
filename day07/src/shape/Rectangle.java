package shape;

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	
	public Rectangle() {
	}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public Rectangle(int x, int y, double width, double height) {
		super(x, y);    //상위 x, y 값을 이용
		this.width = width;
		this.height = height;
	}
	
	//강제 구현
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getCircumn() {
		return (width + height) * 2;
	}
}
