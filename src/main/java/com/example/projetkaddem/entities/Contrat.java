package com.example.projetkaddem.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Contrat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer idContrat;

   @Temporal(TemporalType.DATE)
     Date dateDebutContrat;

    @Temporal(TemporalType.DATE)
   Date datefinContrat;

    @Enumerated(EnumType.STRING)
    Specialite specialite;
    boolean archive;

    Integer montantContrat;

    @ManyToOne()
    Etudiant etudiant;






}
