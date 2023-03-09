package ws0309;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// Lotto 인스턴스 생성
		Lotto lotto = new Lotto();

		// 내 번호 생성
		ArrayList<Integer> myNum = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("1~25 숫자를 3개 입력해주세요");
		while (myNum.size() < 3) {
			int a = 0;
			System.out.println(myNum.size() + 1 + "번째 숫자 입력");
			try {
				a = Integer.parseInt(sc.next());
			} catch (Exception e) {
				System.out.println("1~25 사이 숫자만 입력 가능합니다");
				continue;
			}
			if (a < 1 || a > 25) {
				System.out.println("잘못된 숫자 범위입니다.");
				continue;
			}
			if (myNum.contains(a)) {
				System.out.println("이미 입력된 숫자입니다");
				continue;
			}
			myNum.add(a);
		}
		sc.close();

		// 등수 체크
		int grade = lotto.checkRanking(myNum);

		// 당첨금액 계산
		int myMoney = (int) lotto.prizeMoney(grade);

		// 결과 출력
		System.out.println("총 상금 :" + (int) lotto.getPrizeMoney() + "원");
		System.out.println("당첨 번호 : " + lotto.getWinningNum());
		System.out.println("나의 번호 : " + myNum);
		// System.out.println("일치 횟수 matchCount는 가져올 수 없을까?");
		System.out.println("등수 : " + grade + "등");
		System.out.println("당첨금액 : " + myMoney + "원");
	}

}
