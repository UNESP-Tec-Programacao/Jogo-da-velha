package br.unesp.jogodavelha.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchPlayerRepository extends JpaRepository<MatchRepository, Long> {
}
