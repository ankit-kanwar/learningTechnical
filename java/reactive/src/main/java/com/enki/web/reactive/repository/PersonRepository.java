package com.enki.web.reactive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enki.web.reactive.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
