package we0302;

public class Account {
	private String accNum;
	private String accName;
	private double balance;
	private double rate;
	private String grade;

	public Account() {
		this.accNum = MakeAccountNumber.makeAccNum();
	}

	public Account(String accName, double balance, double rate, String grade) {
		this();
		this.accName = accName;
		this.balance = balance;
		this.rate = rate;
		this.grade = grade;
	}

	public Account(String accNum, String accName, double balance) {
		this();
		this.accName = accName;
		this.balance = balance;
	}

	// getter, setter
	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return balance;
	}

	public double getRate() {
		return rate;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	//

	public void withdraw(double money) {
		if (money <= 0) {
			System.out.println("출금 금액을 확인하세요");
			return; // 종료
		}
		if (this.balance < money) {
			System.out.println("잔액이 부족합니다");
			return; // 종료
		}
		this.balance -= money;
	}

	public void deposit(double money) {
		if (money <= 0) {
			System.out.println(("입금 금액을 확인하세요"));
			return;
		}
		this.balance += money;
	}

	public double getInterest() {
		return balance * (rate * 1.0);
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + ", rate=" + rate + "]";
	}

}
