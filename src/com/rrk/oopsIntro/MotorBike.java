package com.rrk.oopsIntro;

public class MotorBike {
	
	//state
	private int speed; // member variable cannot be accessed outside this class
	
	//behaviour
	//method
		//inputs
		//outputs
		//name
	MotorBike() {
		this(2);
	}
	
	MotorBike(int speed) {
		this.speed = speed;
	}
	
	public void setSpeed(int speed) { // local variable
		if(speed >= 0) {
			this.speed = speed;	
		}
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void increaseSpeed(int additionalSpeed) {
		setSpeed(this.speed + additionalSpeed);
	}
	
	public void decreaseSpeed(int decrementBy) {
		setSpeed(this.speed - decrementBy);
	}
	
	public void start() {
		System.out.println("Started....");
	}
}
