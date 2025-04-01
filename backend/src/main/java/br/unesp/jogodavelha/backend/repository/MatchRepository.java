package br.unesp.jogodavelha.backend.repository;

import br.unesp.jogodavelha.backend.domain.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
}
