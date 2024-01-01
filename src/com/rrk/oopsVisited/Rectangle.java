package com.rrk.oopsVisited;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double newLength) {
		this.length = newLength;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double newWidth) {
		this.width = newWidth;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return 2*(length + width);
	}
	
	public String toString() {
		return String.format("length - %f, width - %f", length, width);
	}
}
