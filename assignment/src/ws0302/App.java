package ws0302;

public class App {

	public static void main(String[] args) {
//		Account 클래스가 다음과 같이 설계 되어 있다.
//		Account 클래스를 구현 하시오
//		단, 계좌 번호는 자동 생성 한다.(MakeAccountNumber 이용)
//		기능, 입금, 출금, 현재이자금액
//		App.java를 통해 Application 을 구현 하시오
//		1. 6개의 Account 객체 배열을 만들어 다음과 같은 객체를 입력 한다.
//		new Account("james1", 10000, 0.35, "VIP");
//		new Account("james2", 10000, 0.45, "GOLD");
//		new Account("james3", 10000, 0.55, "SIVER");
//		new Account("james4", 10000, 0.15, "GOLD");
//		new Account("james5", 10000, 0.28, "SIVER");
//		new Account("james6", 10000, 0.31, "VIP");
//		2. 6개의 계좌 정보를 출력 하시오
//		3. 모든 계좌의 잔액과 현재 이자금액을 출력 하시오
//		4. VIP들의 잔액의 합과 평균으을 출력 하시오

		Account[] arrAccount = { new Account("james1", 10000, 0.35, "VIP"), new Account("james2", 10000, 0.45, "GOLD"),
				new Account("james3", 10000, 0.55, "SIVER"), new Account("james4", 10000, 0.15, "GOLD"),
				new Account("james5", 10000, 0.28, "SIVER"), new Account("james6", 10000, 0.31, "VIP") };
		System.out.println("[계좌정보 출력 case.1]");
		for (int i = 0; i < arrAccount.length; i++) {
			System.out.println(arrAccount[i].toString());
		} // for문을 활용한 배열 출력
		System.out.println("");
		System.out.println("[계좌정보 출력 case.2]");
		for (Account arr : arrAccount) {
			System.out.println(arr);
		} // for-each문을 활용한 배열 출력
		System.out.println("");

		System.out.println("[모든 계좌의 잔액과 현재 이자금액]");
		for (Account arr : arrAccount) {
			System.out.println("계좌번호" + arr.getAccNum() + "의 잔액은" + arr.getBalance() + "원, 현재 이자금액은"
					+ Math.round(arr.getInterest()) + "원 입니다");
		} // for-each문과 getter메서드로 계좌별 잔액과 이자금액 출력 
		System.out.println("");
		System.out.println("[모든 계좌의 잔액과 이자금액 합계]");
		double sum = 0;
		double interestSum = 0;
		for (int i = 0; i < arrAccount.length; i++) {
			sum += arrAccount[i].getBalance();
			interestSum += arrAccount[i].getInterest();
		} // for문을 활용한 전체 계좌 잔액, 이자금액 합계 계산
		System.out.printf("모든 계좌의 잔액 합계: %.1f원 \n", sum);
		System.out.printf("모든 계좌의 이자금액 합계: %.1f원 \n", interestSum);

		System.out.println("");

		double vipSum = 0;
		double avg = 0;
		int cnt = 0;
		for (int i = 0; i < arrAccount.length; i++) {
			if (arrAccount[i].getGrade().equals("VIP")) {
				vipSum += arrAccount[i].getBalance();
				cnt++;
			}
		} // for문에서 if조건을 활용하여 "VIP" grade의 잔액 합계와 평균 계산
		System.out.println("[VIP들의 잔액의 합과 평균]");
		System.out.printf("VIP들의 잔액 합계는 %.1f원\n", vipSum);
		avg = vipSum / cnt;
		System.out.printf("VIP들의 잔액 평균은 %.1f원", avg);
	}
}
