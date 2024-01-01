package com.rrk.oopsVisited;

public class BookRunner {
	public static void main(String[] args) {
		
		Book book1 = new Book(101, "The wings of fire", "APJ Abdul Kalam");
		System.out.println(book1);
		
		Review review1 = new Review(10, "Author shared experiences of life", 5);
		Review review2 = new Review(11, "Great share of experiences by author", 4);
		
		book1.addReview(review1);
		book1.addReview(review2);
		
		System.out.println(book1);
		
	}
}
