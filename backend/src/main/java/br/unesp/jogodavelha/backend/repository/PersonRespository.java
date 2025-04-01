package br.unesp.jogodavelha.backend.repository;

import br.unesp.jogodavelha.backend.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRespository extends JpaRepository<Person, Long> {
}
