package whilecontrol;

public class P94 {

	public static void main(String[] args) {
		//100명의 고객 중 30대 이상의 고객만 소트하고 싶다~ VIP만 소트하고 싶다~ 이럴 때 쓰는 논리구조
		//합과 평균을 구하시오 //짝수만요 // i%2 ==0
		
		int sum = 0;
		double avg = 0.0;
		System.out.println("Start...");

		int cnt = 0;				
		//Case 1.
		for (int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				sum += i;
				cnt++;
			}
			if(i == 8) {
				break;
			}                                //"8까지만 하고 그만둬라" 추가
		
		//Case 2.	
		/*for (int i = 1; i <= 100; i++) {
			if(i%2 != 0) {
				continue;
			}	
			sum += i;
			cnt++;
		}*/
			
			
			
			
		
	}
		avg = sum / (cnt*1.0);
		System.out.printf("%d, %f \n", sum, avg);
		System.out.println("몇 번 돌아갔냐면요 "+cnt);
}
}