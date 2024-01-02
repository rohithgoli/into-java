package com.rrk.oopsVisited.interfaces;

public class ProjectA {
	public static void main(String[] args) {
		ComplexAlgorithm algorithm = new DummyAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 20));
		
		ComplexAlgorithm anotherAlgorithm = new RealAlgorithm();
		System.out.println(anotherAlgorithm.complexAlgorithm(10, 20));
	}
}
