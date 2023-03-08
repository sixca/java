package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Listtest2 {

	public static void main(String[] args) {
		//1~10까지의 숫자를 20개 입력 한다
		//단 while 문을 이용한다.

		List<Integer> list = new ArrayList<Integer>();  //List 자체가 인터페이스라
		Random r = new Random();
		while(list.size()<20) {       //0~19번째 객체들.. 총 몇갠지 생성이니 20개 겠지			
			int num = r.nextInt(10)+1;
			list.add(num);
		}   /// 랜덤숫자를 활용한 총 20개의 숫자 목록을 형성
		
		System.out.println(list.size());   //20
		System.out.println("-------------------------");
		for(int data:list) {
			System.out.println(data);
		}  // 형성한 랜덤숫자 목록을 출력
	}
}
