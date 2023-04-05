package com.emids.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.emids.entity.Author;
import com.emids.entity.Book;

@Configuration
@Import(value = {BookExtraConfig.class})
public class BookConfig {
	@Bean
	@Primary
	public Book getBook1() {
		Book bk = new Book();
		bk.setIsbn("978-23-83310-5");
		bk.setYear("2020");
		bk.setAuthor(getAuthor());
		return bk;
	}
	@Bean
	public Author getAuthor() {
		return new Author("Avinash", "Bareilly");
	}
}
