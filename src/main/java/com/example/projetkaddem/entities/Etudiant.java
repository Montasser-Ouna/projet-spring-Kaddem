package com.example.projetkaddem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Etudiant implements Serializable {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idEtudiant;

    String  prenomE;
    String nomE;
   Option Option;
   @JsonIgnore
   @OneToMany(mappedBy = "etudiant")
    Set<Contrat> contrats;

    @ManyToMany()
    @JsonIgnore
    Set<Equipe> equipes;

    @ManyToOne()
    Departement departement;





}
