package com.seetech.dis;

public class ThisExample {
	String name;
	int id;
	double mobile;
	
	public void details(String name, int id, double mobile) {
		this.name = name;
		this.id = id;
		this.mobile=mobile;
	}
	
	public void display() {
		System.out.println("Name: "+name +" Id: "+id+" Mobile: "+mobile);
	}
	
	

	public static void main(String[] args) {
		ThisExample thisExample = new ThisExample();
		thisExample.details("SeeTech", 001, 87654321);
		thisExample.display();
	}

}
