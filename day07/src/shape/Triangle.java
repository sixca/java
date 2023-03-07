package shape;

public class Triangle extends Shape {

	private double width;
	private double height;
	
	
	public Triangle() {
	}
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public Triangle(int x, int y, double width, double height) {
		super(x, y);    //상위 x, y 값을 이용
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		return width * height / 2;
	}

	@Override
	public double getCircumn() {	
		// z = 루트(x2 + y2)
		double result = 0.0;
		double z = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return z + width + height;
	}
	
}
