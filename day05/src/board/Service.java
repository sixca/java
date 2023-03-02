package board;

public class Service {
//등록, 제거, 수정, 불러오기
	DAO dao;
	
	public Service() {
		dao = new DAO();
 	}      // service 안에서 클래스 DAO를 사용하기 위한 성토작업. 객체 생성 + 초기화
  	
	public void register(String str) {
		// Security or Log
		dao.insert(str);
	}

	public void remove(int num) {
		dao.delete(num);
	}

	public void modify(int num, String str) {
		dao.update(num, str);
	}

	public String get(int num) {
		return dao.select(num);
	}
}
