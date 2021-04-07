package com.aminadabes.biblioteca;

import com.aminadabes.biblioteca.model.Book;
import com.aminadabes.biblioteca.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;


@SpringBootApplication
public class BibliotecaApplication {

	//private static final Logger log = LoggerFactory.getLogger(BibliotecaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}


	/*@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
			// save a few customers
			for (Book book : Arrays.asList(
					new Book("PREGANDO AS PARÁBOLAS", "978-85-275-0918-3", "2019"),
					new Book("Comentario de Lucas", "978-85-7622-480-8", "2014"),
					new Book("Manual dos Tempos e Costumes Biblicos", "978-85-358-0157-6", "2017"),
					new Book("Entendes o que lês?", "978-85-275-0460-7", "2011"),
					new Book("Exegese para que?", "978-85-263-1878-6", "2019"))) {
				repository.save(book);
			}

			*//* OUTRA FORMA DE SE FAZER O QUE FOI FEITO ACIMA
			repository.save(new Book("PREGANDO AS PARÁBOLAS", "978-85-275-0918-3", "2019"));
			repository.save(new Book("Comentario de Lucas", "978-85-7622-480-8", "2014"));
			repository.save(new Book("Manual dos Tempos e Costumes Biblicos", "978-85-358-0157-6", "2017"));
			repository.save(new Book("Entendes o que lês?", "978-85-275-0460-7","2011"));
			repository.save(new Book("Exegese para que?", "978-85-263-1878-6", "2019"));
			 *//*

			// fetch all customers
			log.info("Book found with findAll():");
			log.info("-------------------------------");
			for (Book books : repository.findAll()) {
				log.info(books.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Book books = repository.findById(1L);
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			log.info(books.toString());
			log.info("");

			// fetch customers by last name
			log.info("PASSEI POR AQUI E NÃO FIZ NADA:");
			log.info("--------------------------------------------");
			//repository.listTitle();//.forEach(bauer -> {
				//log.info(repository.listTitle().toString());
			//});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			//  log.info(bauer.toString());
			// }
			log.info("");
		};
	}*/
}
