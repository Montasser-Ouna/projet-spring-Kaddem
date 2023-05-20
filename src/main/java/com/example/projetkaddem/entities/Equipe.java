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
   @Enumerated(EnumType.STRING)
    Niveau niveau;
    @ManyToMany(mappedBy = "equipes",cascade = CascadeType.REMOVE)
    Set<Etudiant> etudiants;
    @OneToOne(mappedBy ="equipe",cascade = CascadeType.REMOVE)
    DetailEquipe detailsEquipe;
}
