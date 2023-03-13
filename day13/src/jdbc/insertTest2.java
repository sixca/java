package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertTest2 {
//Oracle DB 연결
	public static void main(String[] args) {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		} // 해당 데이터베이스에 접속할 수 있는 드라이버 로딩 (구현객체로딩)
		System.out.println("Driver Loading 성공.");

		// Connect
		String id = "bank"; // 우리가 만든 Work Space
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.20.58:1521:XE"; // 작업할 IP주소 입력. 팀DB IP로 통일. 철댈님PC
		String insertSql = "INSERT INTO cust VALUES(?,?,?,?)"; // 우리는 이 문장을 질의한다(Query)


// Statement 생성 - SQL
		// SQL 전송

		try (Connection con = DriverManager.getConnection(url, id, pwd); 
				PreparedStatement pstmt = con.prepareStatement(insertSql);) {
			pstmt.setString(1, "id19");
			pstmt.setString(2, "pwd19");
			pstmt.setString(3, "말자킴");
			pstmt.setInt(4, 50);
			int result = pstmt.executeUpdate();
			System.out.println(result);
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

}
