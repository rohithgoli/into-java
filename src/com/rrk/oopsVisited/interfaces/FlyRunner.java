package com.rrk.oopsVisited.interfaces;

public class FlyRunner {
	public static void main(String[] args) {
		Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
		
		for(Flyable flyableObject: flyingObjects) {
			flyableObject.fly();
		}
		
		Animal[] animals = {new Cat(), new Dog()};
		
		for(Animal animal: animals) {
			animal.bark();
		}
	}
}
