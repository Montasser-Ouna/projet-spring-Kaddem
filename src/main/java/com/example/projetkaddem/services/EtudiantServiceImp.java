package com.example.projetkaddem.services;

import com.example.projetkaddem.entities.Etudiant;
import com.example.projetkaddem.repositories.EtudiantRepository;

import java.util.List;

public class EtudiantServiceImp implements IEtudiantService{
  private EtudiantRepository etudiantRepository;



    @Override
    public List<Etudiant> retriveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant retriveEtudiant(Integer idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }



    @Override
    public void deleteEtudiant(Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);

    }
}
