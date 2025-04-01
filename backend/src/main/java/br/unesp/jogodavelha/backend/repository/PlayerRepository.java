package br.unesp.jogodavelha.backend.repository;

import br.unesp.jogodavelha.backend.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
