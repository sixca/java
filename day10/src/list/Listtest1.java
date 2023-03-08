package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Listtest1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
// 1부터 10까지의 숫자를 랜덤하게 10개 담으세요
		Random r = new Random();
		for(int i=1; i<=10; i++) {
			int num = r.nextInt(10)+1;
			list.add(num);
		}
		list.add(0, 100);   // 0번째는 100
		list.add(5, 100);   // 5번째는 100
		list.remove(5);     //5번째 삭제
		
//		list.add(10);
//		list.add(20);
//		list.add(30);
		for(int data:list) {
			System.out.println(data);
		}
	}
}
