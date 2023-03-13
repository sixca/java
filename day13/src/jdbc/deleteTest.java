package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// delete삭제를 해보자
public class deleteTest {
//Oracle DB 연결
	public static void main(String[] args) {
		// Driver Loading 로딩과정
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		} // 해당 데이터베이스에 접속할 수 있는 드라이버 로딩 (구현객체로딩)
		System.out.println("Driver Loading 성공.");

		// Connect 접속정보
		String id = "bank"; // 우리가 만든 Work Space
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.20.58:1521:XE"; // 작업할 IP주소 입력. 팀DB IP로 통일. 철댈님PC
		String deleteSql = "DELETE FROM cust WHERE id = ?"; // id값을 넣으면 id를 삭제해달라는 요청 질의어

		// Statement 생성 - SQL
		// SQL 전송
		try (Connection con = DriverManager.getConnection(url, id, pwd);
			PreparedStatement pstmt = con.prepareStatement(deleteSql);) {
			
			pstmt.setString(1, "id10");

			int result = pstmt.executeUpdate();
			System.out.println(result);  //0이 뜨게해야 id가 없구나 알 수 있음

		} catch (SQLException e1) {
			e1.printStackTrace();

		} 

	}

}
