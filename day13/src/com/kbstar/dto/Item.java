package com.kbstar.dto;

import java.util.Date;

public class Item {
	private String id;
	private String name;
	private int price;
	private double rate;
	private Date regdate;
	public Item() {
	}
		
	public Item(String name, int price, double rate) {
		this.name = name;
		this.price = price;
		this.rate = rate;
	}

	public Item(String id, String name, int price, double rate, Date regdate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rate = rate;
		this.regdate = regdate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", rate=" + rate + ", regdate=" + regdate
				+ "]";
	}

}
