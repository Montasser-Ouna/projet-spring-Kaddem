package com.example.projetkaddem.entities;

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
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idEquipe;
    String nomEquipe;
    Niveau niveau;
    @ManyToMany(mappedBy = "equipes")
    Set<Etudiant> etudiants;
    @OneToOne(cascade = CascadeType.REMOVE)
    DetailEquipe detailsEquipe;
}
