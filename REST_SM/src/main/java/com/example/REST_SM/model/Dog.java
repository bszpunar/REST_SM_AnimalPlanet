package com.example.REST_SM.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "dog")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "dogGen")
    @GenericGenerator(name = "dogGen")
    private int id;
    private String dogname;
    private int age;

}
