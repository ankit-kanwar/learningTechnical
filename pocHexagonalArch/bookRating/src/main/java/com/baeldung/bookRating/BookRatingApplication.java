package com.baeldung.bookRating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.baeldung.bookRating.domain.Book;

@SpringBootApplication
public class BookRatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookRatingApplication.class, args);
	}

}
