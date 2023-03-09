package ws0309;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//winningNum는 당첨숫자. 미리 정해져야함. 

public class Lotto {
	private Set<Integer> winningNum = new HashSet<Integer>();
	private double prizeMoney;

	public Lotto() {
		this.makeWinningNumberMoney();
	}// Lotto클래스에 당첨금액과 당첨번호 생성하는 메서드 자동 호출

	public Lotto(Set<Integer> winningNum, double prizeMoney) {
		this.winningNum = winningNum;
		this.prizeMoney = prizeMoney;
	}

	// getter
	public Set<Integer> getWinningNum() {
		return winningNum;
	} // 당첨번호 불러오기

	public double getPrizeMoney() {
		return prizeMoney;
	} // 당첨금 불러오기

	///// 당첨번호와 당첨금 생성
	public void makeWinningNumberMoney() {
		this.prizeMoney = new Random().nextInt(2000000000) + 1;
		while (this.winningNum.size() < 3) {
			winningNum.add(new Random().nextInt(25) + 1);
		}
	} // prizeMoney에 랜덤금액, winningNum에 랜덤숫자 3개 지정

	//입력숫자 3개와 몇개가 일치한지 check한 후 등수 리턴
	public int checkRanking(ArrayList<Integer> myNum) {
		int matchCount = 0;
		for (int num : myNum) { // myNum을 num에 넣는다
			if (winningNum.contains(num)) { // matchCount가 num을 포함하고 있다면 1회 카운트
				matchCount++;
			}
		} // 일치한 횟수
			// 3회 일치면 1등, 2회 일치면 2등, 3회 일치면 3등 switch문!

		int grade = 0;
		switch (matchCount) {
		case 0:
			grade = 0;
			break;
		case 1:
			grade = 3;
			break;
		case 2:
			grade = 2;
			break;
		case 3:
			grade = 1;
			break;
		}
		return grade;
	} // myNum과 몇 개가 일치하는지, 일치 횟수에 따른 등수는 몇등인지 리턴

	public double prizeMoney(int grade) {
		double rate = (grade == 0) ? 0 : (grade == 1) ? 0.7 : (grade == 2) ? 0.2 : (grade == 3) ? 0.1 : 0;
		return this.prizeMoney * rate;
	} // 삼항연산자 활용 grade별 rate 구하고, 총상금에 rate를 곱하여 당첨금액 리턴
}
