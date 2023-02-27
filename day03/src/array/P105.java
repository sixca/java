package array;

import java.util.Arrays;
import java.util.Random;

public class P105 {

	public static void main(String[] args) {

		int arr[] = new int[5];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(9) + 1;   //1~9까지의 난수가 5개의 배열 안에 들어간다
		}
		System.out.println(Arrays.toString(arr));
		// 배열의 합과 평균을 구하시오
		// 홀수 번째의 합과 평균을 구하시오
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		for (int i=0; i <arr.length ; i++) {
			if (i%2 == 0) {
				sum += arr[i];
				cnt++;
			}					
		}
		System.out.println(sum);
		avg = sum / (cnt*1.0);
		System.out.printf("%d, %4.2f", sum,avg);
		
		
		
		
	}
	
}
