package com.kbstar.dto;

public class BankUserDTO {  //Date Transfer Object 의미로 사용. 이 클래스를 던져줄것
	//데이터를 셋팅해서 이걸 던져줄 역할을 할 예정
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String contact;
	public BankUserDTO() {
	}
	public BankUserDTO(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	public BankUserDTO(String id, String pwd, String name, String email, String contact) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.contact = contact;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", contact=" + contact
				+ "]";
	}
	
}
