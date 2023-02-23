package variable;

public class P80 {

	public static void main(String[] args) {
		int a = (3>5)? 6:9;
		System.out.println(a);
		//삼항연산자 기본형
		
		//if-else를 삼항연산자로 완성!
		int credit = 900;
		String grade = (credit >= 800)? "High":"Low";
		System.out.println(grade);
		
		
	}
}