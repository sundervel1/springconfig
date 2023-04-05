package com.emids.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.emids.entity.Author;
import com.emids.entity.Book;

@Configuration
public class BookExtraConfig {

	@Bean(name = "book")
	@Scope(value = "prototype")
	public Book getBook() {
		Book bk = new Book();
		bk.setIsbn("978-23-82990-5");
		bk.setYear("2001");
		bk.setAuthor(new Author("Ramu", "Selam"));
		return bk;
	}
}
