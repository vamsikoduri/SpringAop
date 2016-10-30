package org.javabrains.model;

import org.javabrains.aspect.Loggable;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	@Loggable
	public void setName(String name) {
		this.name = name;
		System.out.println("value set for the property of the circle");
		
		
	}
	public String setAndReturnName(String name) {
		this.name = name;
		System.out.println("***SET AND RETURN ****** value set for the property of the circle");
		return name;
	}


}
