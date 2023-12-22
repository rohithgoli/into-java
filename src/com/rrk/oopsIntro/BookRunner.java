package com.rrk.oopsIntro;

public class BookRunner {

	public static void main(String[] args) {
		
		Book artOfComputerProgramming = new Book(1000);
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		artOfComputerProgramming.setNoOfCopies(100);

		Book effectiveJava = new Book(1000);
		effectiveJava.setNoOfCopies(80);
		
		Book cleanCode = new Book(1000);
		cleanCode.setNoOfCopies(40);
		
		artOfComputerProgramming.openBook();
		effectiveJava.openBook();
		cleanCode.openBook();
		
		artOfComputerProgramming.increaseCopies(100);
		effectiveJava.decreaseCopies(1000);
		cleanCode.increaseCopies(50);
		
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
	}
	
}
