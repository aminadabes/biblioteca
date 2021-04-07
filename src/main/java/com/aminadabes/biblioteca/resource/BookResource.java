package com.aminadabes.biblioteca.resource;

import com.aminadabes.biblioteca.model.Book;
import com.aminadabes.biblioteca.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/biblioteca")
public class BookResource {

    @Autowired
    BookRepository bookRepository;

    @PostMapping("/book")
    public Book salvar(@RequestBody Book book) {
       return bookRepository.save(book);
    }

    @GetMapping("/books")
    public List<Book> listarTodos() {
        return bookRepository.findAll();
    }

    @GetMapping("/book/{code}")
    public Book buscaLivroPorCodigo(@PathVariable(value="code") long code) {
        return bookRepository.findById(code);
    }
}


