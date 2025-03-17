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
    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String mail;

    @Getter @Setter
    private int age;

    @Getter @Setter
    private String country;

    public Person(){}

}
