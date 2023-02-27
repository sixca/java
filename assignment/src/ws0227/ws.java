package ws0227;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ws {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input Commend[q,a1,a2,a3,a4]");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Quit..");
				break;
			} else if (cmd.equals("a1")) {
				// 5~9까지의 숫자를 입력 받는다. ->> 5~9 외에 숫자 입력 시 다시 되돌아 가도록 (반복문)
				// 입력 받은 숫자만큼 배열을 생성 하고 ->> 입력값을 활용한 배열 생성
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다. ->> 랜덤 함수를 활용하여 배열에 랜덤값 적용
				// 배열 정보를 출력한다. ->> 배열 출력
				// 배열의 합과 평균을 출력한다. ->> for문으로 각각의 합을 더하고, 짝수 홀수 등 조건이 있으면 if 조건을 건다
				int a;
				while (true) {
					System.out.println("5~9까지의 숫자를 입력해주세요");
					a = sc.nextInt();
					if (a < 5 || a > 9) {
						System.out.println("잘못된 숫자입니다. ");
						continue;
					}
					break;
				}

				int[] arr = new int[a];

				for (int i = 0; i < arr.length; i++) {
					arr[i] = new Random().nextInt(9) + 1;
				}
				System.out.println(Arrays.toString(arr));

				int sum = 0;
				double avg = 0.0;
				int cnt = 0;

				for (int data : arr) {
					sum += data;
					cnt++;
				}
				avg = sum / (cnt * 1.0);
				System.out.printf("합계는 :%d, 평균은%4.2f \n\n", sum, avg);

			} else if (cmd.equals("a2")) {
				// 5~9까지의 숫자를 입력 받는다.
				// 입력 받은 숫자만큼 배열을 생성 하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 짝수 번재 숫자들의 합과 평균을 출력한다.
				int a;
				while (true) {
					System.out.println("5~9까지의 숫자를 입력해주세요");
					a = sc.nextInt();
					if (a < 5 || a > 9) {
						System.out.println("잘못된 숫자입니다");
						continue;
					}
					break;
				}

				int[] arr = new int[a];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = new Random().nextInt(9) + 1;
				}
				System.out.println(Arrays.toString(arr));

				int sum = 0;
				double avg = 0.0;
				int cnt = 0;

				for (int i = 0; i < arr.length; i++) {
					if (i % 2 != 0) {
						sum += arr[i];
						cnt++;
					}
					avg = sum / (cnt * 1.0);
				}
				System.out.printf("합계는 %d, 평균은 %4.2f\n\n", sum, avg);

			} else if (cmd.equals("a3")) {
				// 5~9까지의 숫자를 입력 받는다.
				// 입력 받은 숫자만큼 배열을 생성 하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 짝수값만의 합과 평균을 출력한다.

				int a;
				while (true) {
					System.out.println("5~9까지의 숫자를 입력해주세요");
					a = sc.nextInt();
					if (a < 5 || a > 9) {
						System.out.println("잘못된 숫자입니다");
						continue;
					}
					break;
				}
				int arr[] = new int[a];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = new Random().nextInt(9) + 1;
				}
				System.out.println(Arrays.toString(arr));

				int sum = 0;
				double avg = 0.0;
				int cnt = 0;

				for (int data : arr) {
					if (data % 2 == 0) {
						sum += data;
						cnt++;
					}
				}
				if (sum == 0) {
					avg = sum / (cnt * 1.0);
				} else {
					avg = 0;
				}

				System.out.printf("합계는 :%d, 평균은 :%4.2f\n\n", sum, avg);

			} else if (cmd.equals("a4")) {
				// 5~9까지의 숫자를 2개 입력 받는다.
				// 2차원 배열을 만든다.
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배결의 합과 평균을 출력한다.
				System.out.println("5~9 사이의 숫자를 2개입력해주세요.");
				int a;
				int b;
				while (true) {
					System.out.println("첫번째 숫자");
					a = sc.nextInt();
					if (a < 5 || a > 9) {
						System.out.println("잘못된 숫자입니다.");
						continue;
					}
					break;
				}
				while (true) {
					System.out.println("두번째 숫자");
					b = sc.nextInt();
					if (a < 5 || a > 9) {
						System.out.println("잘못된 숫자입니다.");
						continue;
					}
					break;
				}

				int[][] arr = new int[a][b];
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr.length; j++) {
						arr[i][j] = new Random().nextInt(9) + 1;
						System.out.print(arr[i][j] + " ");
					}
					System.out.println("");   //행마다 줄바꿈
				}
				int sum = 0;
				double avg = 0.0;
				//cnt 없이, 행과 열의 갯수를 곱하여 총 숫자의 수를 구함
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr.length; j++) {
						sum += arr[i][j];
					}
					avg = (sum*1.0) / (a * b);    //sum에 1.0을 곱하여 실수로 변환
				}
				System.out.printf("\n\n2중 배열의 합계는 :%d, 2중 배열의 평균은 :%4.2f\n\n", sum, avg);

			} else {
				System.out.println("Invalid Command..");
				System.out.println("Tri Again..");
			}
		} // end while
		System.out.println("Bye..");
		sc.close();
	}

}
