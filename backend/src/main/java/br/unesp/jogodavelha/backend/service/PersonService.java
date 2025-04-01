package br.unesp.jogodavelha.backend.service;

import br.unesp.jogodavelha.backend.domain.Person;
import br.unesp.jogodavelha.backend.exceptions.PersonException;
import br.unesp.jogodavelha.backend.repository.PersonRespository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRespository personRespository;

    public PersonService(PersonRespository personRespository) {
        this.personRespository = personRespository;
    }

    public List<Person> list(){
        return this.personRespository.findAll();
    }

    public Optional<Person> find(Person person){
        return Optional.of(
                this.personRespository
                        .findById(
                                person.getId()))
                .orElseThrow(() -> new PersonException("Person not found"));
    }

    public Person findPersonByMail(String mail){
        return Optional.of(
                this.personRespository
                        .findByMail(mail))
                .orElseThrow(() -> new PersonException("Person not found"));
    }

    public Boolean delete(Person person) {
        try {
            this.personRespository.delete(person);
            return true;
        } catch (Exception e) {
            throw new PersonException("An error occurred trying to delete the person");
        }
    }

    public Boolean createOrUpdate(Person person){
        try{
            this.personRespository.save(person);
            return true;
        }catch (Exception e){
            throw new PersonException("An error occurred trying to save the person");
        }
    }
}
