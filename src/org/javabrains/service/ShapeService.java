package org.javabrains.service;

import org.javabrains.aspect.Loggable;
import org.javabrains.model.Circle;
import org.javabrains.model.Triangle;

public class ShapeService {

	private Circle circle;
	private Triangle triangle;
	
	
	public Circle getCircle() {
		System.err.println("GetCircle method called from ShapeService");
		return circle;

	}
	
	
	public void setCircle(Circle circle) {
		System.err.println("setCircle method called from ShapeService");
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	
}
