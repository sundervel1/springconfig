package com.emids;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.emids.config.BookConfig;
import com.emids.entity.Author;
import com.emids.entity.Book;

public class BookMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BookConfig.class);
		//Book bk = (Book) ctx.getBean(Book.class);
		Book bk = (Book) ctx.getBean("book");
		System.out.println(bk);
		Book bk1 = (Book) ctx.getBean("book");
		bk1.setYear("2012");
		System.out.println(bk);
		Author auth = ctx.getBean(Author.class);
		System.out.println(auth);
	}

}
