package br.unesp.jogodavelha.backend.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Table
@Entity
@Data
public class Person {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Setter
    private Long id;

    @Setter
    private String name;

    @Setter
    @Column(unique = true)
    private String mail;

    @Setter
    private int age;

    @Setter
    private String country;

    public Person(){}

}
