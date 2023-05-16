package com.example.projetkaddem.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idUniv;
    String nomUniv;
    @OneToMany(cascade = {CascadeType.REMOVE,CascadeType.PERSIST})
    Set<Departement> departements;
}

