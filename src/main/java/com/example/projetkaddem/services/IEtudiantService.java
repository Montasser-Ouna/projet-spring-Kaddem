package com.example.projetkaddem.services;

import com.example.projetkaddem.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retriveAllEtudiants();
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    Etudiant retriveEtudiant(Integer idEtudiant);


    void deleteEtudiant(Integer idEtudiant);
}
