package com.application.LibraryApp;

import com.application.LibraryApp.entity.Author;
import com.application.LibraryApp.entity.Book;
import com.application.LibraryApp.entity.Category;
import com.application.LibraryApp.entity.Publisher;
import com.application.LibraryApp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class LibraryAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(LibraryAppApplication.class, args);
    }


}



