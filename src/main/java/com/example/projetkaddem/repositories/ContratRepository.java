package com.example.projetkaddem.repositories;

import com.example.projetkaddem.entities.Contrat;
import com.example.projetkaddem.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface ContratRepository extends JpaRepository<Contrat, Integer> {
    Integer countByArchiveIsFalseAndEtudiant(Etudiant etudiant);


    Integer countByArchiveIsFalseAndDateDebutContratBetween(Date dateDebutContrat, Date datefinContrat);
}