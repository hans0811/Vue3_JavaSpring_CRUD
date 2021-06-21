package com.hansvue.springbootvue.repository;

import com.hansvue.springbootvue.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
