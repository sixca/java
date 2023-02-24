package ifcontrol;

public class P86 {

	public static void main(String[] args) {
		//if, if-else, if-else
		
		//고객정보
		String grade = "";
		String gender = "M";
		double sum = 92.0;
		
		System.out.println("start...");
		
		if (gender.equals("M")) {
			System.out.println("Male..");
		}else {
			System.out.println("Female..");
		}
		
		grade = (sum >= 90)? "VIP" : (sum >= 70)? "GOLD" : "SILVER";
		
		
		/*if(sum >= 90.0) {
			grade = "VIP";
		}else if(sum >= 70.0) {
			grade = "GOLD";
		}else {
			grade = "SILVER";
		}*/
		
		if (grade.equals("VIP")) {
			System.out.println("VIP 혜택 받으세요");
			//return;    //반복이 아닌 제어문에서 실행문을 끝내기 위해 사용. 뒤에 end출력 안 함.
		}
		
		System.out.printf("%s, %s, %.1f\n", grade, gender, sum);
		
		System.out.println("End...");

	}

}
