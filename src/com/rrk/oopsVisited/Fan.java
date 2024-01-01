package com.rrk.oopsVisited;

public class Fan {
	
	// member variables
	private String make;
	private double radius;
	private String color;	// can use enums too

	private boolean isOn;
	private int speed;	// can use enums too
	
	// creation - constructors
	// Most important things with which object cannot be created
	
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}
	
	// member methods
	
	// isOn
	
	public void switchOn() {
		this.isOn = true;
		changeSpeed(2);
	}
	
	public void switchOff() {
		this.isOn = false;
		changeSpeed(0);
	}
	
	public void changeSpeed(int updatedSpeed) {
		this.speed = updatedSpeed;
	}
	
	public String toString() {
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", 
				make, radius, color, isOn, speed);
	}
}
