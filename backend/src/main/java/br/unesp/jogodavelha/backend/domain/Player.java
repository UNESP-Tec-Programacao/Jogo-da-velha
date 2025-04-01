package br.unesp.jogodavelha.backend.domain;

import jakarta.persistence.*;

@Entity
@Table
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Person person;

    @Column(length = 50, nullable = false)
    private String nickname;
}
