package org.javabrains.model;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("value set for the property of the circle");
		throw(new RuntimeException());
		
	}
	public String setAndReturnName(String name) {
		this.name = name;
		System.out.println("***SET AND RETURN ****** value set for the property of the circle");
		return name;
	}


}
