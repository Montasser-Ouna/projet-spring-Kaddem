package com.example.projetkaddem.repositories;

import com.example.projetkaddem.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {

   Etudiant findByNomEAndPrenomE(String nom, String prenom);
   @Query("select e from Etudiant e where e.nomE = ?1 and e.prenomE = ?2")
   Etudiant getEtudiantByNomEAndPrenomE(@Param("nom") String nomE,@Param("prenom") String prenomE);
}