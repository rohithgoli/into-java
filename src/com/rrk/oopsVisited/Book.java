package com.rrk.oopsVisited;

import java.util.ArrayList;

public class Book {
	
	private int id;
	private String title;
	private String author;
	
	private int rating;
	private ArrayList<Review> reviews = new ArrayList<>();
	
	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public void addReview(Review newReview) {
		this.reviews.add(newReview);
	}
	
	public String toString() {
		return String.format("id - %d, title - %s, author - %s, reviews - [%s]", 
				id, title, author, reviews);
	}
}
