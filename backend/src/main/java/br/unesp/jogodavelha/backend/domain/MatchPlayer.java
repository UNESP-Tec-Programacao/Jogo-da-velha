package br.unesp.jogodavelha.backend.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class MatchPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Player player1;

    @OneToOne
    private Player player2;

    @OneToOne
    private Match match;

}
