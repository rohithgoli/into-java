package com.rrk.oopsIntro;

public class Book {
	
	//state
	private int noOfCopies;
	
	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if(noOfCopies >= 0) {
			this.noOfCopies = noOfCopies;	
		}
	}
	
	public void increaseCopies(int incrementCount) {
		setNoOfCopies(this.noOfCopies + incrementCount);
	}
	
	public void decreaseCopies(int decrementCount) {
		setNoOfCopies(this.noOfCopies - decrementCount);
	}

	public void openBook() {
		System.out.println("Book opened ...");
	}
}
