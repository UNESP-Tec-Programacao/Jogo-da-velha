package br.unesp.jogodavelha.backend.repository;

import br.unesp.jogodavelha.backend.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
