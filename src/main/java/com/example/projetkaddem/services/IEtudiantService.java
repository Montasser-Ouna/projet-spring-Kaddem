package com.example.projetkaddem.services;

import com.example.projetkaddem.entities.Etudiant;

import javax.transaction.Transactional;
import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retriveAllEtudiants();
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    Etudiant retriveEtudiant(Integer idEtudiant);


    void deleteEtudiant(Integer idEtudiant);

    Etudiant assignerEtudiantDepartement(Integer idEtudiant, Integer idDepartement);

    Etudiant addAndAssignEtudiantToContratAndEquipe(Etudiant etudiant, Integer idContrat, Integer idEquipe);

    @Transactional
    Etudiant addAndAssignEtudiantToContratAndEquipeandDep(Etudiant etudiant, Integer idContrat, Integer idEquipe);

    List<Etudiant> getEtudiantByDepartement(Integer idDepartement);
}
