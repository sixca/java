package array;

import java.util.Arrays;
import java.util.Random;

public class P104 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		Random r = new Random();   //난수 발생

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(99) + 1; //1~99까지의 난수가 10개의 배열 안에 들어간다
		}
		System.out.println(Arrays.toString(arr));
		// 배열의 합과 평균을 구하시오
		int sum = 0;
		for (int a : arr) {
				sum += a;	
			}
		double avg = 0.0;
		avg = sum/(arr.length*1.0);
		System.out.printf("합계: %d, 평균: %.2f", sum, avg);
	}
	
}
