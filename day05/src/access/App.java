package access;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee();
		
		//e.
		// private 처리된 건 안 보이고, protected는 같은 패키지니 보이고, default도 보이고..
		// 다른 패키지로 넘어가서 이 클래스를 쓰려면 접근제어 처리된 함수들은 안 보임.

	}

}
