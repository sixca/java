package array;

import java.util.Scanner;

public class P122 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("Input Commend[q,a1,a2,a3,a4]");
				String cmd = sc.next();
				if (cmd.equals("q")) {
					System.out.println("Quit..");
					break;
				} else if (cmd.equals("a1")) {
					System.out.println("Select..");

				} else if (cmd.equals("a2")) {
					System.out.println("Select..");

				} else if (cmd.equals("a3")) {
					System.out.println("Select..");

				} else if (cmd.equals("a4")) {
					System.out.println("Select..");

				} else {
					System.out.println("Invalid Command..");
					System.out.println("Tri Again..");
				}
			} // end while
			System.out.println("Bye..");
			sc.close();
		}

	}
