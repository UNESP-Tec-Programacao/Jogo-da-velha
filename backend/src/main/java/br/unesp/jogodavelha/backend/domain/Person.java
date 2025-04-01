package br.unesp.jogodavelha.backend.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Table
@Entity
@Data
@ToString
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

    public Person(String name, String mail, int age, String country) {
        this.name = name;
        this.mail = mail;
        this.age = age;
        this.country = country;
    }

    public Person(Integer id){
        this.id = Long.valueOf(String.valueOf(id));
    }
}
