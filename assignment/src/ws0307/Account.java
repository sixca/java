package ws0307;

public class Account {
	private String accNo;
	private String name;
	private String accHolder;
	private double balance;
	public Account() {
		this.accNo = MakeAccountNumber.makeAccNo();
	}
	public Account(String name, String accHolder, double balance) throws MinusException {
		this();
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
		if(balance < 0) {
			throw new MinusException("음수 금액은 입력이 불가합니다");
		}
				
	}	//Constructor - 음수 예외 상황

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accHolder=" + accHolder + ", balance=" + balance + "]";
	}
	public double getBalance() {
		return balance;
	} 	// 잔액 조회
	
	public void withdraw(double money) throws Exception {		
		if(money < 0) {
			throw new MinusException("음수 금액은 입력이 불가합니다");
		}
		if(balance < money) {
			throw new MinusException("잔액이 부족합니다");
		}
		this.balance -= money;
	}	// 출금 - 잔액 부족 예외 상황, 음수 예외 상황 	
	
	public void deposit(double money) throws Exception {		
		if(money < 0) {
			throw new MinusException("음수 금액은 입력이 불가합니다");
		}
		this.balance += money;
	}	// 입금 - 음수 예외 상황
}
