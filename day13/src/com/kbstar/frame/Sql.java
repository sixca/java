package com.kbstar.frame;

public class Sql {
	public static String deleteSql = "DELETE FROM cust WHERE id = ?";
	public static String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";
	public static String updateSql = "UPDATE cust SET pwd=?, name=?, age=? WHERE id=?"; //id가 4번으로
	public static String selectSql = "SELECT * FROM cust WHERE id = ?";
	public static String selectAllSql = "SELECT * FROM cust"; 
}


//static으로 Sql문 인터페이스를 만들어서 하나로 묶어서 class.sql 이렇게 사용하자