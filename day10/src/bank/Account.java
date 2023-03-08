package bank;

public class Account {
	private String accNo;
	private double balance;
	public Account() {
		this.accNo = MakeAccountNumber.makeAccNum();
	}
	
	public Account(double balance) throws Exception {
		this();
		if(balance < 0) {
			throw new Exception("ER0001");            //예외 객체를 만들어 던진다
		}
		this.balance = balance;
	}
	
	public Account(String accNo, double balance) throws Exception {
		if(balance < 0) {
			throw new Exception("ER0001");            //예외 객체를 만들어 던진다, 메세지를 만들어서..   msgcod 따로 안 따도 되네;;
		}
		this.accNo = accNo;
		this.balance = balance;
	}

	public void withdraw(double money) throws Exception {
		if(money <= 0) {
			throw new Exception("ER0002");
	}
		if(balance < money) {
			throw new Exception("ER0003");
		}
		balance -= money;
}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
}
