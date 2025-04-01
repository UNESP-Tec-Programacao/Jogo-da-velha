package br.unesp.jogodavelha.backend.domain;

import jakarta.persistence.*;

@Entity
@Table
public class MatchPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Player player1;

    @OneToOne
    private Player player2;

    @OneToOne
    private Match match;

}
