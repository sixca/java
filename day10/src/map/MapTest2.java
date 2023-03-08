package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");

		Set<Integer> keys = map.keySet(); // 모든 키를 Set객체에 담아서 리턴
		System.out.println(keys.toString());  // 확인한번 해보시고
		
		for(int data:keys) {
			System.out.println(map.get(data));
		}   // map에서 각 keys들의 값을 끄집어 내달라
		
	}

}
