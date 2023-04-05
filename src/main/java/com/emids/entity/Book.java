package com.emids.entity;

public class Book {
	private String isbn;
	private String year;
	private Author author;
	public Book() {
	}
	public Book(String isbn, String year, Author author) {
		super();
		this.isbn = isbn;
		this.year = year;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", year=" + year + ", author=" + author + "]";
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
}
