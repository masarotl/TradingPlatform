package com.masa.trade.user;

public class Shareholder {

	private String name;

	public Shareholder(String id) {
		name = id;
	}

	public void makeRequest() {

	}

	public void thisIsReallyCool() {

	}

	public static void main(String... args) {
		System.out.println("Shareholder class " + new Shareholder("MARK").getName());
	}
	
	public String getName(){
		return name;
	}
}
