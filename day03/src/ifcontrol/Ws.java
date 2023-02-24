package ifcontrol;

public class Ws {

	public static void main(String[] args) {
		
		
		int sum = 0;
		double avg = 0;
		
		System.out.println("Start...");
		int cnt = 0;
		
		int i = 1;
		// 3의 배수의 합과 평균을 구하시오 while문
		while (i <= 100) {
			if(i%3 == 0)  {
				sum += i;
				cnt++;
			}
			i++;		
		}	
		
		// 3의 배수의 합과 평균을 구하시오 for문
		/*for(i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
				i++;
				cnt++;
			}
		}*/
		
		// 4의 배수의 합과 평균을 구하시오
		/*while (i <= 100) {
			if(i%4 == 0)  {
				sum += i;
				cnt++;
			}
			i++;		
		}	*/
		
		// 4의 배수의 합과 평균을 구하시오 for문
		/*for(i=1; i<=100; i++) {
			if(i%4 == 0) {
				sum += i;
				i++;
				cnt++;
			}
		}*/

		// 7의 배수의 합과 평균을 구하시오
		/*while (i <= 100) {
			if(i%7 == 0)  {
				sum += i;
				cnt++;
			}
			i++;		
		}	*/	
		
		// 7의 배수의 합과 평균을 구하시오 for문
		/*for(i=1; i<=100; i++) {
			if(i%7 == 0) {
				sum += i;
				i++;
				cnt++;
			}
		}*/
		
		avg = (sum*1.0)/cnt;    // 실수로 답내기 위해 *1.0함
		System.out.printf("%d, %f \n", sum, avg);
		System.out.println("End..." + cnt + "번 돌았슴다");  
	}
}

