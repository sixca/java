package array;

import java.util.Arrays;
import java.util.Random;

public class P103 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		Random r = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			int data = r.nextInt(99)+1;    
			arr[i] = data;  //난수가 1~99 값이 막 들어가서 출력되겠지
			// arr[i] = r.nextInt(99)+1; 도 가능
			
		}
		System.out.println(Arrays.toString(arr));  //메서드 Arrays.toString() 사용해서 배열 출력
		
		//배열의 합과 평균을 구하시오
		for (int a : arr) {
			
			
			System.out.printf("%d \t", a);
		}
		
		
	}

}
