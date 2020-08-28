package com.enki.web.reactive.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.enki.web.reactive.model.Person;
import com.enki.web.reactive.repository.PersonRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping("{id}")
	public @ResponseBody Mono<Person> findById(@PathVariable Long id){
		Optional<Person> person = personRepository.findById(id);		
		return Mono.just(person.orElse(Person.empty()));
	}
	
	@GetMapping
	Flux<Person> list(){
		List<Person> person = personRepository.findAll();
		Flux<Person> personFlux = Flux.fromIterable(person);
		return personFlux;
	}
}
