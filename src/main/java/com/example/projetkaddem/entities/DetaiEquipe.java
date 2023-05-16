package com.example.projetkaddem.entities;

import javax.persistence.*;
import java.io.Serializable;

public class DetaiEquipe implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer idDetailEquipe;
Integer salle;
String thematique;
@OneToOne(cascade = CascadeType.ALL)
    Equipe equipe;
}
