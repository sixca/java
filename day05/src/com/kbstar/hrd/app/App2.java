package com.kbstar.hrd.app;

import com.kbstar.hrd.Employee;
import com.kbstar.hrd.Manager;

public class App2 {

	public static void main(String[] args) {
		Manager [] manager = new Manager[3];
		manager[0] = new Manager("301", "Steve", 500, 100);
		manager[1] = new Manager("302", "James", 550, 200);
		manager[2] = new Manager("303", "beil", 700, 300);
		
		for(Manager mag : manager) {       //for-each문
			System.out.println(mag);			
			System.out.println(mag.getTax());			
			System.out.println(mag.getAnnSalary());
			System.out.println(mag.getAnnTax());			
		}
	}

}
