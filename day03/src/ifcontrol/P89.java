package ifcontrol;

public class P89 {

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
		
		//점수별 성별별 등급부여
		/*if(gender.equals("M")) {
			if(sum >= 90) {
				grade = "MVIP";
			}else if(sum >= 80) {
				grade = "MGOLD";
			}else {
				grade = "MNORMAL";
			}	
		} else {
			if(sum >= 90) {
				grade = "FVIP";
			}else if(sum >= 80) {
				grade = "FGOLD";
			}else {
				grade = "FNORMAL";
			}
		}*/
		
		//위 사례 삼항연산자로 변환
				
		grade = (gender.equals("M"))?
				((sum >= 90)? "MVIP" : (sum >= 80)? "MGOLD" : "MNORMAL"):
				((sum >= 90)? "FVIP" : (sum >= 80)? "FGOLD" : "FNORMAL");
		
		
		//성별, 등급별 가산점 주기
		switch(grade) {
		case "FVIP":
		case "MVIP":
			sum += 100;
			break;
		case "FGOLD":
		case "MGOLD":
			sum += 90;
			break;
		default:
			sum += 10;
		}
		
		//break를 넣으면 각 등급별 가산점을 주지만, break를 빼면 vip는 gold+디폴트 가산점도 전부 받음
		
		
		
		if (grade.equals("MVIP")) {
			System.out.println("MVIP 혜택 받으세요");
			//return;    //반복이 아닌 제어문에서 실행문을 끝내기 위해 사용. 뒤에 end출력 안 함.
		}
		
		System.out.printf("%s, %s, %.1f\n", grade, gender, sum);
		
		System.out.println("End...");

	}

}
