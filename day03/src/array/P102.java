package array;

public class P102 {

	public static void main(String[] args) {
		int a = 100;
		
		int arr[] = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr);   //출력 안 되쥬
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d \t", arr[i]);   //for문을 이용한 출력
		}
		System.out.println("Type 2");             //for-each문을 이용한 출력
		for(int data :arr) {
			System.out.println(data);
		}
	}

}
