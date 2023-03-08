package bank;

public class Atm {

	public static void main(String[] args) {
		Account acc1 = null;   //객체 초기화 null
		try {
			acc1 = new Account(10000);
			System.out.println(acc1);
			acc1.withdraw(-50);
			System.out.println(acc1);
		}catch (Exception e) {
			System.out.println(MakeMessage.makeMessage(e.getMessage()));
			System.out.println(e.getMessage());
		}		

	}

}
