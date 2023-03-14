package com.kbstar.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kbstar.dto.Cust;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CustDaoImpl implements DAO<String, String, Cust> {

	public CustDaoImpl() { // 드라이버 loading은 여기서 한번하고 끝
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
	}

	public Connection getConnection() throws Exception { // connection은 여기 만들어둔 메서드로 계속 쓰겠다

		Connection con = null; // txt로 박아놓고 불러오자 코드 수정없이 txt파일을 수정하도록! Properties.

		Properties props = new Properties();
		String fileName = "db_info.txt";
		FileInputStream in = new FileInputStream(fileName);
		props.load(in);

		String id = props.getProperty("DB_ID");
		String pwd = props.getProperty("DB_PWD");
		String url = props.getProperty("DB_URL");
		con = DriverManager.getConnection(url, id, pwd);
		return con;
	}

	@Override
	public void insert(Cust v) throws Exception {
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.setInt(4, v.getAge());
			int result = pstmt.executeUpdate();		//중복된 값이 추가되면 예외	
		} catch (SQLException e1) {    //접속에 문제가 생겼을 시 발생되어지는 예외상황들
			throw e1;    //문제생기면 예외를 요청하는 App단으로 던져
			//e1.printStackTrace();
		} 
	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.deleteSql);) {
			pstmt.setString(1, k);

			int result = pstmt.executeUpdate();
			if(result == 0) {
				throw new Exception("ID없음");
			}			
			//System.out.println(result);
		} catch (SQLException e1) {    
			throw e1;            // 여기는 DB장애 오류가 날아가도록
		} 
	}

	@Override
	public void update(Cust v) throws Exception {
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.updateSql);) {
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getAge());
			pstmt.setString(4, v.getId());

			int result = pstmt.executeUpdate();
			
			if(result == 0) {
				throw new Exception("수정할 자료가 없음");
			}		
		} catch (SQLException e1) {   
			throw e1;   
		} 
	}

	@Override
	public Cust select(String k) throws Exception {
		Cust cust = null;
		try (Connection con = getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(Sql.selectSql); ) {
			pstmt.setString(1, k);
			
			try(ResultSet rset = pstmt.executeQuery()) {
				rset.next();
				String id = rset.getString("id");
				String pwd = rset.getString("pwd");
				String name = rset.getString("name");
				int age = rset.getInt("age");
				cust = new Cust(id, pwd, name, age);
			}catch(Exception e) {
				throw e;                //데이터가 없으면 여기서 예외
			}
			
		}catch(Exception e) {
			throw e;
//			e.printStackTrace();       //소프트웨어 오류는 여기 예외가되는구나 트레이스로 추적해서 오류코드, 오류위치 확인가능!
		}
		
		return cust;
		
		
		
		
		
		
//		Cust cust = null; //!!
//		try (Connection con = getConnection();
//				PreparedStatement pstmt = con.prepareStatement(Sql.selectSql);) {
//				pstmt.setString(1, k);
//				
//				try(ResultSet rset = pstmt.executeQuery()){   //결과를 rset 변수에 담았쬬. id, pwd, name, age
//					rset.next();                    // 데이터 이전에 포인트를 가르키고 있어서 한칸 이동 시킨 것. 이걸 하고 데이터를 끄집어 내야 함.
//					String db_id = rset.getString("id");
//					String db_pwd = rset.getString("pwd");
//					String name = rset.getString("name");
//					int age = rset.getInt("age");
//					System.out.println(db_id + " " + db_pwd + " " + name + " " + age);
//
//				}catch(Exception e) {
//					throw e; //!!	
//				}	
//			} catch (Exception e1) {
//				throw e1; //!!
//			}
//		return cust; //!!
		
	}

	@Override
	public List<Cust> selectAll() throws Exception {
		List<Cust> list = new ArrayList<Cust>();
		try(Connection con = getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(Sql.selectAllSql); ){
			try(ResultSet rset = pstmt.executeQuery();) {
				while(rset.next()) {
					Cust cust = null;
					String id = rset.getString("id");
					String pwd = rset.getString("pwd");
					String name = rset.getString("name");
					int age = rset.getInt("age");
					cust = new Cust(id, pwd, name, age);
					list.add(cust);
				}
			}catch(Exception e) {
				throw e;    //데이터가 없을 때
			}
		}catch(Exception e) {
			throw e;        //시스템 장애일 때
		}
		
		return list;
		
		
//		List<Cust> list = new ArrayList<Cust>();
//		try (Connection con = getConnection();
//				PreparedStatement pstmt = 
//				con.prepareStatement(Sql.selectAllSql);) {
//				//pstmt.setString(1, k);  !!
//				
//				try(ResultSet rset = pstmt.executeQuery()){   //결과를 rset 변수에 담았쬬. id, pwd, name, age
//					while(rset.next()) {
//					Cust cust = null;	
//					String db_id = rset.getString("id");
//					String db_pwd = rset.getString("pwd");
//					String name = rset.getString("name");
//					int age = rset.getInt("age");
//					cust = new Cust(db_id, db_pwd, name, age);
//					list.add(cust);
//				}
//				}catch(SQLException e) {
//					e.printStackTrace();
//				}	
//				if(list.size() == 0) {     //!!
//					throw new Exception("없음");
//				}
//			} catch (Exception e1) {
//				throw e1; //!!
//		}
//		
//		return list;
	}

	@Override
	public List<Cust> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
