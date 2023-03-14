package com.kbstar.frame;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

public interface DAO<K1, K2, V> {
	 public void insert(V v) throws Exception;
	 public void delete(K1 k) throws Exception;
	 public void update(V v) throws Exception;
	 public V select(K1 k) throws Exception;
	 public List<V> selectAll() throws Exception;
	 public List<V> search(K2 k) throws Exception;
	 
	 public default Connection getConnection() throws Exception { // connection은 여기 만들어둔 메서드로 계속 쓰겠다

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
		}    //Connection 메서드를 최상단에 인터페이스에 넣어버리자... 어디든 동일하게 사용하니
}
