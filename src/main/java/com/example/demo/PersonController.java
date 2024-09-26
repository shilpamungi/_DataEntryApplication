package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	

	@GetMapping
    public List<Person> getPersonList() {
        return personRepository.findAll();
    }

    @PostMapping("/submit")
    public Person submitForm(@RequestBody Person person) {
    	return personRepository.save(person);
    }
}
