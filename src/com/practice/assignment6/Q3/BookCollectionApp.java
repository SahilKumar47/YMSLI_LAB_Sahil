package com.practice.assignment6.Q3;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;


class Book implements Comparable<Book> {
	private String nameString;
	private String authorString;

	public Book(String nameString, String authorString) {
		this.nameString = nameString;
		this.authorString = authorString;
	}

	public String getNameString() {
		return nameString;
	}

	public String getAuthorString() {
		return authorString;
	}
	
	@Override
	public int hashCode() {
		return nameString.length() + authorString.length();
	}

	@Override
	public boolean equals(Object object) {
		boolean result = false;
		if (object == null || object.getClass() != getClass()) {
			result = false;
		} else {
			Book b = (Book) object;
			if (this.nameString == b.getNameString() && this.authorString == b.getAuthorString()) {
				result = true;
			}
		}
		return result;
	}

	@Override
    public String toString() {
        return nameString + "---" + authorString;
    }
	
	@Override
	public int compareTo(Book b) {
		int val = this.getNameString().compareTo(b.getNameString());
		if (val == 0) {
			val = this.getAuthorString().compareTo(b.getAuthorString());
		}
		return val;

	}

}

class BookCollection {
	private String name;
	private HashSet<Book> books;

	public BookCollection(String name, HashSet<Book> books) {
		this.name = name;
		this.books = books;
	}

	@Override
	public String toString() {
		String string = "Collection Name: " + name;
		for (Book b : books) {
			string += "\t" + b.toString() + "\n"; 
		}
		return string;
	}

	public void hasBook(Book b) {
		if (books.contains(b))
			System.out.println("book found");
		else {
			System.out.println("book not found");
		}
	}

	public void sort() {
		List<Book> aList = new ArrayList<Book>();
		for (Book x : books)
			aList.add(x);
		Collections.sort(aList);
		for (Book b : aList) {
			System.out.println("Book Name: " + b.getNameString() + ", Author Name" + b.getAuthorString());
		}
	}
}

public class BookCollectionApp {
	public static void main(String[] args) {
		HashSet<Book> books = new HashSet<>();
		// Books
		books.add(new Book("Java in depth", "john"));
		books.add(new Book("Tales of horizon", "jane"));
		books.add(new Book("Get started with C++", "mike"));
		books.add(new Book("Python for beginners", "rayan"));
		BookCollection bookCollection = new BookCollection("MyBook", books);
		bookCollection.hasBook(new Book("Java in depth", "john"));
		System.out.println(bookCollection);
		bookCollection.sort();
	}
}
