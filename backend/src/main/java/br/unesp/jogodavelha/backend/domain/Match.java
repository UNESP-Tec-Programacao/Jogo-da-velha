package br.unesp.jogodavelha.backend.domain;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table
public class Match {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private Instant dateTime;

    @OneToOne
    private Player winner;

}
