
package com.kbstar.frame;

public class Sql {
	//bankuser DML
	public static String deleteSql = "DELETE FROM bankuser WHERE id = ?";
	public static String insertSql = "INSERT INTO bankuser VALUES(?,?,?,?,?)";
	public static String updateSql = "UPDATE bankuser SET pwd=?, name=?, email=?, contact=? WHERE id=?"; //id가 4번으로
	public static String selectSql = "SELECT * FROM bankuser WHERE id = ?";
	public static String selectAllSql = "SELECT * FROM bankuser";

	//account DML
	public static String accountDeleteSql = "DELETE FROM account WHERE accno =?";
	public static String accountInsertSql = "INSERT INTO account VALUES(?,?,?)";
	public static String accountUpdateSql = "UPDATE account SET balance=? WHERE accno=?";
	public static String accountSelectSql = "SELECT * FROM account WHERE accno = ?";
	public static String accountSelectAllSql = "SELECT * FROM account";
	public static String myAccountSelectAllSql = "SELECT * FROM account WHERE holder = ?";
	
	//transaction DML
	public static String trInsertSql = "INSERT INTO transaction VALUES (?,SYSDATE,?,?,?,?)";
	public static String trSelectSql = "SELECT * FROM transaction WHERE id = ?";
	public static String trSelectAllSql = "SELECT * FROM transaction";
	public static String mytrSelectAllSql = "SELECT * FROM transaction WHERE accno=?";
}