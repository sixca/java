package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		//1~10까지의 숫자를 10개 입력 하세요
		
		Random r = new Random();
//		for(int i = 0; i < 10; i++) {
//			int num = r.nextInt(10) + 1;
//			set.add(num);
//		}		
		
		while(set.size() < 10) {
			int num = r.nextInt(10)+1;
			set.add(num);
		}  // 중복되지 않는 10개의 숫자를 생성하는 것임.
		
		
		System.out.println(set.size());
		System.out.println("----------------");
		for(int data : set) {
			System.out.println(data);
		}
	}  //생성된 난수를 set에 추가하고, 
	// Set은 중복을 허용하지 않기 때문에 같은 숫자가 이미 set에 있는 경우 새로운 숫자를 추가하지 않음. 
	//그래서 차례대로 1~10 출력
}
