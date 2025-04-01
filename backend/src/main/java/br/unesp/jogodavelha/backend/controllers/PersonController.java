package br.unesp.jogodavelha.backend.controllers;

import br.unesp.jogodavelha.backend.domain.Person;
import br.unesp.jogodavelha.backend.exceptions.PersonException;
import br.unesp.jogodavelha.backend.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PostMapping("/create/{name}/{mail}/{age}/{country}")
    public String create(@PathVariable("name") String name, @PathVariable("mail") String mail,
                         @PathVariable("age") Integer age, @PathVariable("country") String country){
        this.personService.createOrUpdate(new Person(name, mail, age, country));
        return "Person created successfully";
    }

    @GetMapping("/searchByMail/{mail}")
    public Person searchByMail(@PathVariable("mail") String mail){
        return this.personService.findPersonByMail(mail);
    }

    @GetMapping("/findById/{id}")
    public Person findById(@PathVariable("id") Integer id){
        Optional<Person> person = this.personService.find(new Person(id));
        if(person.isPresent()){
            return person.get();
        }else{
            throw new PersonException("Person not found");
        }
    }

    @DeleteMapping("/delete/{mail}")
    public Boolean deleteByMail(@PathVariable("mail") String mail){
        return this.personService.delete(personService.findPersonByMail(mail));
    }

}
