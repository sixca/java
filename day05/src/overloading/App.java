package overloading;

public class App {
//함수명(sum)이 같아도 argument가 다르면 오버로딩
//리턴타입도 신경 안 씀(int냐 double이냐), 오직 아규먼트의 타입이나 갯수가 다르면 다른 함수로 인식.
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.sum(10, 20));
		System.out.println(c.sum(10, 20, 30));
		System.out.println(c.sum(10, 20, 30, 40));
		
	}

}
