package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(1, "B");
		map.put(1, "C");
		map.put(1, "D");
		map.put(1, "E");
		//키는 중복될 수 없지만 값은 중복 저장 가능
		System.out.println(map.size());  //1개
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
				
		System.out.println(map.size());   //5개
		System.out.println(map.containsKey(5)); //키 5번이 있니? 불리언 
		System.out.println(map.containsValue("D")); //값 D가 있니? 불리언
		
		System.out.println(map.get(1)); //A :: 1번 키의 값을 리턴  
		
		//키값을 끄집어 낸 후, 그 키에 있는 값을 가져온다
		
		System.out.println("-----");
		Set<Integer> keys = map.keySet(); // 모든 키를 Set객체에 담아서 리턴
		System.out.println(keys.toString());
		
		for(int data:keys) {
			System.out.println(map.get(data));
		}   // map에서 각 keys들의 값을 끄집어 내달라
		
	}

}
