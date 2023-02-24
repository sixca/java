package whilecontrol;

public class P95 {

	public static void main(String[] args) {
//1~100까지의 합과 평균을 구하세요 // 짝수만요
		
		
		int sum = 0;
		double avg = 0;
		
		System.out.println("Start...");
		int cnt = 0;
		
		int i = 1;
		while (i <= 10) {
			if(i%2 == 0)  {
				sum += i;
				cnt++;
			}
			if(i == 8) {
				break;
			}                                //"8까지만 하고 그만둬라" 추가
			i++;
			
		
		}	
		avg = (sum*1.0)/cnt;    // 실수로 답내기 위해 *1.0함요
		System.out.printf("%d, %f \n", sum, avg);
		System.out.println("End..." + i + "번 돌았쓔");  //4번이여야하는데 왜 8번 돌았다고 뜨지..? 짝수만 돌았는데;;
	}
}


