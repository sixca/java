package com.kbstar.dto;

public class TransactionDTO {
	private String date;      //자료를 끌어와서 구분하기 위한 키값이 될 것임. primary key  :: 데이터베이스에서 테이블의 각 행을 구별하는 식별자를 말함
	private String accNo;      //어떤 계좌의 거래내역이냐
	private double balance;
	private String type; // I / O      입출금. 인아웃.   
	private String desc; // 기재내용
	public TransactionDTO() {
	}


	public TransactionDTO(String date, String accNo, double balance, String type, String desc) {
		this.date = date;
		this.accNo = accNo;
		this.balance = balance;
		this.type = type;
		this.desc = desc;
	}


	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "TransactionDTO [accNo=" + accNo + ", balance=" + balance + ", type=" + type + ", desc=" + desc + "]";
	}
	
}
