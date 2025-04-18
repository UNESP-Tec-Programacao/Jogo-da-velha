package br.unesp.jogodavelha.backend.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Person person;

    @Column(length = 50, nullable = false)
    private String nickname;
}
