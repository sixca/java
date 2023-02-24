package ifcontrol;

import java.util.Scanner;

public class P93 {

	public static void main(String[] args) {
		// 숫자를 4개의 2자리수를 입력 받는다.
		// 평균과 합계를 구한다.

		// 평균이 90이상이면 A
		// 평균이 80이상이면 B
		// 평균이 70이상이면 C
		// 평균이 60이상이면 D
		// 60미만이면 F

		// 합계, 평균, 학점을 출력 하시오

		Scanner sc = new Scanner(System.in); // 브라우져에서 입력되는 모든 값은 String이다
		int ko = 0;
		int en = 0;
		int ma = 0;
		int si = 0;

		int sum = 0;
		float average = 0;
		String grade = "";

		System.out.println("국어성적 입력:");
		ko = Integer.parseInt(sc.next()); // sc.next()는 System.in에 입력된 값 가져오기
		if (10 > ko || ko >= 100) {
			sc.close();
			return; // if에 해당되면 리턴되게(멈추게)
		}
		System.out.println("영어성적 입력:");
		en = Integer.parseInt(sc.next()); // 숫자 두자리수를 받기 위해 nextLine()에 0번 부터 2개를 받도록 설정
		if (10 > en || en >= 100) {
			sc.close();
			return; // if에 해당되면 리턴되게(멈추게)
		}
		System.out.println("수학성적 입력:");
		ma = Integer.parseInt(sc.next());
		if (10 > ma || ma >= 100) {
			sc.close();
			return; // if에 해당되면 리턴되게(멈추게)
		}
		System.out.println("과학성적 입력:");
		si = Integer.parseInt(sc.next());
		if (10 > si || si >= 100) {
			sc.close();
			return; // if에 해당되면 리턴되게(멈추게)
		}

		sum = ko + en + ma + si;
		average = (float) sum / 4; // 혹은 average = sum/4.0; 해도 실수로 바뀐 sum이 됨.

		if (average >= 90) {
			grade = "A";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 70) {
			grade = "C";
		} else if (average >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		// 삼항연산자로 변환 grade = () ? : ;
		grade = (average >= 90) ? "A" : (average >= 80) ? "B" : (average >= 70) ? "C" : (average >= 60) ? "D" : "F";

		System.out.printf("합계: %d, 평균: %.2f, 학점: %s", sum, average, grade);

		sc.close();

	}
}
