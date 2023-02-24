package ifcontrol;

public class P88 {

	public static void main(String[] args) {
		//if, if-else, if-else
		
		//고객정보
		String grade = "";
		String gender = "M";
		double sum = 63.0;
		
		System.out.println("start...");
		
		if (gender.equals("M")) {
			System.out.println("Male..");
		}else {
			System.out.println("Female..");
		}	
		
		
		
		
		
		//다중 조건
		if ((sum <= 100 && sum >=95) || (sum <= 90 && sum >=85)) {
			grade = "VIP";
		}else if ((sum <= 80 && sum >=75) || (sum <= 65 && sum >=60)) {
			grade = "GOLD";
		}else {
			grade = "NORMAL";		
		}
		
		//기존
		/*if (sum >= 90) {
			grade = "VIP";
		}else if (sum >= 80.0) {
			grade = "GOLD";
		}else if (sum >= 70.0) {
			grade = "SILVER";
		}else if (sum >= 60.0) {
			grade = "BRONZE";
		}else {
			grade = "NORMAL";		
		}*/
		
		
		
		
		if (grade.equals("VIP")) {
			System.out.println("VIP 혜택 받으세요");
			//return;    //반복이 아닌 제어문에서 실행문을 끝내기 위해 사용. 뒤에 end출력 안 함.
		}
		
		System.out.printf("%s, %s, %.1f\n", grade, gender, sum);
		
		System.out.println("End...");

	}

}
