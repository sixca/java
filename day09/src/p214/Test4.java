package p214;

import java.util.Random;

public class Test4 {

	public static void main(String[] args) {
		int ar[] = new int[10];
		Random r = new Random();
		
		for(int i =0; i < ar.length; i++) {
			ar[i] = r.nextInt(10)+1;  //배열에 1~10사이 숫자를 대입
		}
		for(int data : ar) {
			System.out.println(data);    //배열 순서대로 출력
			try {
				Thread.sleep(2000);      // 2초 지나고 실행
			} catch (InterruptedException e) {         //Interrupt 발생가능성이 있으니 예외처리
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
