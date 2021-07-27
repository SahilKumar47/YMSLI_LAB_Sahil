package com.practice.assignment2.bookStore;

public class Book {
	private String bookTitle;
	private String author;
	private String ISBN;
	private int numberOfCopies;

	public Book(String bookTitle, String author, String ISBN, int numberOfCopies) {
		this.author = author;
		this.bookTitle = bookTitle;
		this.ISBN = ISBN;
		this.numberOfCopies = numberOfCopies;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	public void display() {
		System.out.println(
				"Book: " + bookTitle + " Author: " + author + " ISBN: " + ISBN + " number of copies " + numberOfCopies);
	}
}
