package com.hansvue.springbootvue.repository;

import com.hansvue.springbootvue.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void findAll(){
        System.out.println(bookRepository.findAll());
    }

    @Test
    void save(){
        Book book = new Book();
        book.setName("Spring boot");
        book.setAuthor("test");
        Book book1 = bookRepository.save(book);
        System.out.println(book1);
    }

    @Test
    void findById(){
        Book book = bookRepository.findById(1).orElse(null);
        System.out.println("\n this is findbyid");
        System.out.println(book);
    }

    @Test
    void update(){
        Book book = new Book();
        book.setId(121);
        book.setName("testUpdate");
        bookRepository.save(book);

    }

    @Test
    void delete(){
        bookRepository.deleteById(119);
    }

}