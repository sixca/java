package com.kbstar.frame;

public interface Notification {
	public void sendEmail(String email, String msg) throws Exception;
	public void sendSMS(String contact, String msg) throws Exception;	
	
}
