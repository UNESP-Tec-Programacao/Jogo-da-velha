package br.unesp.jogodavelha.backend.controllers;

import br.unesp.jogodavelha.backend.domain.Person;
import br.unesp.jogodavelha.backend.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/list")
    public List<Person> list(){
        return personService.list();
    }

}
