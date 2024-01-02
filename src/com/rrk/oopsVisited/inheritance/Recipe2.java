package com.rrk.oopsVisited.inheritance;

public class Recipe2 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Get the utensils");
		System.out.println("SwitchOn the microwave");
	}

	@Override
	void doTheDish() {
		System.out.println("do the dish");
		System.out.println("Place it in microwave");
	}

	@Override
	void cleanup() {
		System.out.println("SwitchOff the microwave");
		System.out.println("Clean the utensils");
		System.out.println("Clean cooking area");
	}

}
