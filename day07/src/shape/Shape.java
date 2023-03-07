package shape;
//추상클래스의 기본 모형
public abstract class Shape {
	protected int x;
	protected int y;
	public Shape() {
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}  //초기화 컨스트럭터
	
	//Abstract Method
	public abstract double getArea();
	public abstract double getCircumn();
	
	public String getXY() {
		return x + " , " + y;
	}
}
