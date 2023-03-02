package bank;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Account acc = null;     // while문 안에 넣어버리면, App이 실행되는 내내 계속 초기화가 되니 값이 누적되지 않음
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input Command(c,w,d,s,q...)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye..");
				break;
			} else if (cmd.equals("c")) {
				System.out.println("Create Account:");
				System.out.println("Input Account Info[name, balance]");
				System.out.println("Input name:");
				String name = sc.next();
				System.out.println("Input Balance");
				double balance = Double.parseDouble(sc.next());

				acc = new Account(name, balance);
				System.out.println(acc);
			} else if (cmd.equals("w")) {
				System.out.println("Withdraw:");
				System.out.println("Input Widthdraw Money..");
				double money = Double.parseDouble(sc.next());
				acc.withdraw(money);
				System.out.println(acc);
			} else if (cmd.equals("d")) {
				System.out.println("Deposit:");
				System.out.println("Input Deposit Money..");
				double money = Double.parseDouble(sc.next());
				acc.deposit(money);
				System.out.println(acc);				
			} else if (cmd.equals("s")) {
				System.out.println("Select:");
				System.out.println(acc);
			}
		}
		sc.close();
	}
}
