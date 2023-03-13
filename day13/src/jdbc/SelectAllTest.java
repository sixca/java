package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// selectAll을 해보자
public class SelectAllTest {
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
		String url = "jdbc:oracle:thin:@172.16.21.60:1521:XE"; 
		String selectAllSql = "SELECT * FROM cust"; 

		// Statement 생성 - SQL
		// SQL 전송
		try (Connection con = DriverManager.getConnection(url, id, pwd);    //p224 자동 close
			PreparedStatement pstmt = con.prepareStatement(selectAllSql);) {
			
			try(ResultSet rset = pstmt.executeQuery()){   //rset에는 전체 정보가 들어있겠지
				while(rset.next()) {  //커서 한칸 이동해서 while loop - 반복
					String db_id = rset.getString("id");
					String db_pwd = rset.getString("pwd");
					String name = rset.getString("name");
					int age = rset.getInt("age");
					System.out.println(db_id + " " + name + " " + age);		
				}
			}catch(SQLException e) {
				e.printStackTrace();	
			}
		} catch (SQLException e1) {
			
		} 
	}
}
