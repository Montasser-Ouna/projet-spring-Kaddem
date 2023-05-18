package com.example.projetkaddem.repositories;

import com.example.projetkaddem.entities.Etudiant;
import com.example.projetkaddem.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {

}