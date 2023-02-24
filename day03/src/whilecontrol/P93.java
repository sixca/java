package whilecontrol;

public class P93 {

	public static void main(String[] args) {
//1~100까지의 합과 평균을 구하세요
		
		int i = 1;
		int sum = 0;
		double avg = 0;
		
		System.out.println("Start...");

		while (i <= 100) {
			sum += i;
			i++;			
		}
		avg = (sum*1.0)/(i-1);    // 실수로 답내기 위해 *1.0함요
		System.out.printf("%d, %f \n", sum, avg);
		System.out.println("End..." + (i-1) + "번 돌았쓔");
	}

}
