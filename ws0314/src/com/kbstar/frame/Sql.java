
package com.kbstar.frame;

public class Sql {
	//Cust DML
	public static String deleteSql = "DELETE FROM cust WHERE id = ?";
	public static String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";
	public static String updateSql = "UPDATE cust SET pwd=?, name=?, age=? WHERE id=?"; //id가 4번으로
	public static String selectSql = "SELECT * FROM cust WHERE id = ?";
	public static String selectAllSql = "SELECT * FROM cust"; 

	//Item DML
	public static String itemDeleteSql = "DELETE FROM item WHERE id =?";
	public static String itemInsertSql = "INSERT INTO item VALUES (?,?,?,?,SYSDATE)";
	public static String itemUpdateSql = "UPDATE item SET name=?,price=?, rate=? WHERE id=?";
	public static String itemSelectSql = "SELECT * FROM item WHERE id=?";
	public static String itemSelectAllSql = "SELECT * FROM item";

	//Cart DML
	public static String CartDeleteSql = "DELETE FROM cart WHERE id =?";
	public static String CartInsertSql = "INSERT INTO cart VALUES (?,?,?,?,SYSDATE)";
	public static String CartUpdateSql = "UPDATE cart SET user_id=?,item_id=?,cnt=? WHERE id=?";
	public static String CartSelectSql = "SELECT * FROM cart WHERE id=?";
	public static String CartSelectAllSql = "SELECT * FROM cart";
	public static String mycartSelectAllSql = "SELECT * FROM cart WHERE user_id=?";
	
	
}
