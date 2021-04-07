package com.aminadabes.biblioteca.repository;

import com.aminadabes.biblioteca.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    Book findById(long code);
}
