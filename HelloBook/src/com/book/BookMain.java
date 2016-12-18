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
		System.out.println("给masterd打上v_master_1.0的标签");
		System.out.println("v_master_1.0 完结");
		System.out.println("v_master_1.1 开始");
		//紧急修改masterd_v1.0
		int a = 5;
		for(int i=0;i<a;i++){
			System.out.println("i=:"+i);
		}
	}
}
