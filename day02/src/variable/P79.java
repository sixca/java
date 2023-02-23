package variable;

public class P79 {

	public static void main(String[] args) {
		int a = (3>5)? 6:9;
		System.out.println(a);
		//삼항연산자 기본형
		
		//if-else를 삼항연산자로 만들어보쟈 ->> P80
		int credit = 0;
		String grade = "";
		if(credit >= 800) {
			grade = "High";
		}else {
			grade = "Low";	
		}
		System.out.println(grade);
		
		
	}
}