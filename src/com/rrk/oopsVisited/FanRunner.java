package com.rrk.oopsVisited;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("usha", 0.48, "teakwood");
		fan.switchOn();
		fan.changeSpeed(5);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
//		System.out.println(fan.toString());
	}
	
}
