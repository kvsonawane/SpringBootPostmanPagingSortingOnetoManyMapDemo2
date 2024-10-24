package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPostmanPagingSortingOnetoManyMapDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPostmanPagingSortingOnetoManyMapDemo2Application.class, args);
	}

}

/*


GET: Get all authors (with pagination, sorting)	 /authors?page=0&size=4&sortBy=name&sortDir=asc/desc

GET: Get author by ID	/authors/{id}

POST: Create a new author	/authors (POST with JSON body)

PUT: Update an existing author	/authors/{id} (PUT with JSON body)

DELETE: Delete an author	/authors/{id}


 */

/*
 
 
 GET: Get all books (with pagination, sorting)	/books?page=0&size=4&sortBy=title&sortDir=desc/asc
 
 GET: Get book by ID	/books/{id}
 
 POST: Create a new book	/books (POST with JSON body)
 
 PUT: Update an existing book	/books/{id} (PUT with JSON body)
 
 DELETE: Delete a book	/books/{id}
 
 
 */
