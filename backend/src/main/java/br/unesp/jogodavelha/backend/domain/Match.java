package br.unesp.jogodavelha.backend.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Entity
@Table
@Data
public class Match {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private Instant dateTime;

    @OneToOne
    private Player winner;

}
