package com.book;

import com.model.Book;

public class BookMain {
	public static void main(String[] args) {
		Book book = new Book();
		book.setId("bookDellId");
		book.setName("bookDellName");
		System.out.println("book:");
		System.out.println("    id:"+book.getId());
		System.out.println("    name:"+book.getName());
		System.out.println("建立develop分支");
	}
}
