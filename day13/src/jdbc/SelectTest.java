package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// select를 해보자  P263에서 JDBC의 기초 정리하세요
public class SelectTest {
//Oracle DB 연결
	public static void main(String[] args) {
		// Driver Loading 로딩과정
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		} 
		System.out.println("Driver Loading 성공.");

		// Connect 접속정보
		String id = "bank"; 
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.20.58:1521:XE"; 
		String selectSql = "SELECT * FROM cust WHERE id = ?"; 

		// Statement 생성 - SQL
		// SQL 전송
		try (Connection con = DriverManager.getConnection(url, id, pwd);    //p224 자동 close
			PreparedStatement pstmt = con.prepareStatement(selectSql);) {
			pstmt.setString(1, "id01");
			
			try(ResultSet rset = pstmt.executeQuery()){   //결과를 rset 변수에 담았쬬. id, pwd, name, age
				rset.next();                    // 데이터 이전에 포인트를 가르키고 있어서 한칸 이동 시킨 것. 이걸 하고 데이터를 끄집어 내야 함.
				String db_id = rset.getString("id");
				String db_pwd = rset.getString("pwd");
				String name = rset.getString("name");
				int age = rset.getInt("age");
				System.out.println(db_id + " " + name + " " + age);
				
			}catch(SQLException e) {
				e.printStackTrace();	
			}

			
		} catch (SQLException e1) {
			
		} 

	}

}
