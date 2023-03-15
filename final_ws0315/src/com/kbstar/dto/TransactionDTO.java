package com.kbstar.dto;

public class TransactionDTO {
	private String id;
	private String date;      
	private String accNo;     
	private double balance;
	private String type; // I / O      입출금. 인아웃.   
	private String description; 
	
	public TransactionDTO() {
	}
	
	public TransactionDTO(String id, String date, String accNo, double balance, String type, String description) {
		this.id = id;
		this.date = date;
		this.accNo = accNo;
		this.balance = balance;
		this.type = type;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TransactionDTO [id=" + id + ", date=" + date + ", accNo=" + accNo + ", balance=" + balance + ", type="
				+ type + ", description=" + description + "]";
	}

}