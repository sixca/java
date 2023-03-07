package bank;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
//		Account acc = new Account("1001", "acc1", "이순신", 10000);
		Account acc = null; 
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input Command(c,w,d,i,q...)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye..");
				break;
			} else if (cmd.equals("c")) {
				System.out.println("Create Account:");
				System.out.println("Input Account Info[name, accHolder, balance]");
				System.out.println("Input name:");
				String name = sc.next();
				System.out.println("Input accHolder:");
				String accHolder = sc.next();
				System.out.println("Input Balance");
				double balance = Double.parseDouble(sc.next());

				try {
					acc = new Account(name, accHolder, balance);
					System.out.println(acc);
				} catch (MinusException e) {
					System.out.println(e.getMessage());					
				} 
			
			} else if (cmd.equals("w")) {
				System.out.println("Withdraw:");
				System.out.println("Input Widthdraw Money..");
				double money = Double.parseDouble(sc.next());
				try {
					acc.withdraw(money);
				} catch (MinusException e) {
					System.out.println(e.getMessage());
				} catch (NullPointerException e) {
					System.out.println("계좌를 생성해주세요");
				}
				System.out.println(acc);
				
			} else if (cmd.equals("d")) {
				System.out.println("Deposit:");
				System.out.println("Input Deposit Money..");
				double money = Double.parseDouble(sc.next());
				try {
					acc.deposit(money);
				} catch (MinusException e) {
					System.out.println(e.getMessage());
				} catch (NullPointerException e) {
					System.out.println("계좌를 생성해주세요");
				}
				System.out.println(acc);				
			} else if (cmd.equals("i")) {	
				System.out.println("Account Information:");	
				try {
					System.out.println(acc.toString());
				} catch (NullPointerException e) {
					System.out.println("계좌를 생성해주세요");					
				}
				
			}
		}
		sc.close();
	}
}
