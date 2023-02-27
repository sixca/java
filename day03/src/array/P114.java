package array;

import java.util.Arrays;
import java.util.Random;

public class P114 {
/* 2차원 배열의 출력 */
	public static void main(String[] args) {
		int arr[][] = new int[5][5];

		Random r = new Random();
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = r.nextInt(9)+1;  //1~9까지의 값중 랜덤하게
			}
		}
		System.out.println(Arrays.toString(arr)); // 주소번지가 출력되서 엉뚱한 출력값
		//for문을 활용한 출력
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println("");
		}
		//위 내용을 for-each로 변경하시오
		System.out.println("--------------------------");
		
		for(int[] a : arr) {         // arr 배열 5개를 추출해라
			for(int data: a) {			 // 그 배열들의 값(5개)를 출력해라
				System.out.printf("%d \t", data);
				
			}
			System.out.println("");
		}
		
		
		
	}

}
