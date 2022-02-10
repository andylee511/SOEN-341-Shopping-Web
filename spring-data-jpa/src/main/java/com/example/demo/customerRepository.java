package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface customerRepository extends JpaRepository<customer, Long> {

    Optional<customer> findcustomerByEmail(String email);
    //List<customer> findcustomerByFirstNameEqualsAndAgeEquals(String first_name, String email);



}
