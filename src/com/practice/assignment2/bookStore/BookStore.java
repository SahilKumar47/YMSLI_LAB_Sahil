package com.practice.assignment2.bookStore;

//import java.util.Scanner;

public class BookStore {
	private Book books[];
	private int size = -1;

	public BookStore() {
		this.books = new Book[10];
	}

	public void sell(String bookTitle, int noOfCopies) {
		int i;
		if (size < 0) {
			System.out.println("Store is empty pls order some books");
			return;
		}
		int flag = 0;
		for (i = 0; i <= size; i++) {
			if (books[i].getBookTitle() == bookTitle) {
				if (books[i].getNumberOfCopies() == 1) {
					books[i] = null; // instead of deleting the object mark it as null
					System.out.println("Book sold and got out of stock");
					flag = 1;
					size--;
				} else {
					books[i].setNumberOfCopies(books[i].getNumberOfCopies() - noOfCopies);
					flag = 1;
					System.out.println("Book Sold");
				}
			}
		}
		if (flag == 0) {
			System.out.println("Book not found");
		}
	}

	public void order(String isbn, int noOfCopies) {
		for (int i = 0; i <= size; i++) {
			if (books[i].getISBN() == isbn) {
				books[i].setNumberOfCopies(books[i].getNumberOfCopies() + noOfCopies);
				System.out.println("Book added");
				return;
			}
		}

//		Scanner scanner = new Scanner(System.in);
//		String name = null, author = null;
//	
//			System.out.println("Enter the name of the book and the author");
//			 name = scanner.nextLine();
//			 author = scanner.nextLine();
//	
			if (size < 10) {
				books[++size] = new Book("Book1", "Author1", isbn, noOfCopies);
				
				System.out.println("Book entered");
			} else {
				System.out.println("Books array is full, Can't order more books");
			}
		
//		scanner.close();

	}

	public void display() {
		if (size >= 0) {
			for (int i = 0; i <= size; i++)
				books[i].display();
		} else
			System.out.println("Store is empty pls order books");
	}

}
