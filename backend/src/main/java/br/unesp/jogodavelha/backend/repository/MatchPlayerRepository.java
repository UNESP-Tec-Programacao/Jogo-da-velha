package br.unesp.jogodavelha.backend.repository;

import br.unesp.jogodavelha.backend.domain.MatchPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchPlayerRepository extends JpaRepository<MatchPlayer, Long> {
}
