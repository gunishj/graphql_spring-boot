/**
 * 
 */
package com.gunish.graphql.service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import com.gunish.graphql.model.Author;
import com.gunish.graphql.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gunish.graphql.repository.AuthorRepository;

import graphql.schema.DataFetcher;
import reactor.core.publisher.Mono;

/**
 * @author Gaurav Sharma
 */
@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository repository;
	
	public Mono<String> createAuthor(String authorName, int age, UUID bookId) {
		Author author = new Author();
		author.setAge(age);
		author.setName(authorName);
		author.setBookId(bookId);
		return repository.createAuthor(author).map(Object::toString);
	}
	
	public DataFetcher<CompletableFuture<Author>> authorDataFetcher() {
		return env -> {
			Book book = env.getSource();
			return repository.getAuthor(book.getId()).toFuture();
		};
	}
}



















