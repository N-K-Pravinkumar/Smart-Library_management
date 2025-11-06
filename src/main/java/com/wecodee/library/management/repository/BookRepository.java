package com.wecodee.library.management.repository;

import com.wecodee.library.management.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{

}
