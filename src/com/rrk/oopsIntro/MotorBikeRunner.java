package com.rrk.oopsIntro;

public class MotorBikeRunner {
	
	public static void main(String[] args) {
		MotorBike splendor = new MotorBike(20);
		MotorBike activa = new MotorBike(10);
		
		System.out.println(splendor.getSpeed());
		System.out.println(activa.getSpeed());
		
		splendor.start();
		activa.start();
		
		splendor.setSpeed(100);
		activa.setSpeed(80);
		
		splendor.setSpeed(65);
		activa.setSpeed(25);
		
		splendor.increaseSpeed(28);
		activa.increaseSpeed(50);

		splendor.decreaseSpeed(50);
		activa.decreaseSpeed(50);
		
		System.out.println(splendor.getSpeed());
		System.out.println(activa.getSpeed());
	}
	
}
