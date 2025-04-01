package br.unesp.jogodavelha.backend.repository;

import br.unesp.jogodavelha.backend.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRespository extends JpaRepository<Person, Long> {

    Person findByMail(String mail);

}
