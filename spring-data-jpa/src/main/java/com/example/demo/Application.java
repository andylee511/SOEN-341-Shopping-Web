package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(customerRepository CustomerRepository){
        return args -> {
            customer John = new customer(1,
                    "John",
                    "Smith",
                    "pphaoniubi@gmail.com",
                    "pphaoniubi",
                    "12345678pP!" );
            CustomerRepository.save(John);
            CustomerRepository.findcustomerByEmail("pphaoniubi@gmail.com")
                    .ifPresentOrElse(System.out::println, () -> System.out.println("customer not found"));

        };
    }


}
