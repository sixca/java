package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.kbstar.dto.UserDTO;

public class MapTest4 {
	//같은 프로젝트에 있는 DTO 클래스를 활용해서 Map실습
	public static void main(String[] args) {
		Map<String, UserDTO> db = new HashMap<String, UserDTO>();    //HashMap 인터페이스로 구현한다이
		db.put("id01", new UserDTO("id01", "pwd01", "james1"));
		db.put("id02", new UserDTO("id02", "pwd02", "james2"));
		db.put("id03", new UserDTO("id0#", "pwd03", "james3"));    //키, 데이터
		
		UserDTO u = db.get("id02");
		System.out.println(u);           //id02에 해당하는 데이터를 u변수에 박고 출력
		
		UserDTO uu = new UserDTO("id02","0000","james");
		db.put(uu.getId(), uu);			// UserDTO의 값을 변경하여 uu변수에 박고 출력

		System.out.println("--------------");
		
		//db에서 전체값들을 가져오라
		Collection<UserDTO> col = db.values();
		//가져온 전체 값들을 출력하라
		for(UserDTO user : col) {
			System.out.println(user);
		}
		
	}

}
