package array;

import java.util.Scanner;

public class P122 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {       //계속 반복
			System.out.println("Input Command[q,i,s]");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Quit..");
				break;
				
			}else if (cmd.equals("a1")) {
				
			}else if (cmd.equals("a2")) {
			
			}else if (cmd.equals("a3")) {
				
			}else if (cmd.equals("a4")) {
				
			}else {
				System.out.println("Invalid Command..");
				System.out.println("Try Again");
			}
		}  // end while
		System.out.println("Bye...");
		sc. close();
	}

}
