package array;

public class P120 {

	public static void main(String[] args) {
//int a[] 배열의 합과 평균을 for문을 이용하여 구하시오		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		double avg = 0.0;
		for(int data : a) {
			sum += data;			
		}
		avg = sum / (a.length*1.0);
		System.out.printf("%d, %4.2f", sum, avg);	

	}

}
