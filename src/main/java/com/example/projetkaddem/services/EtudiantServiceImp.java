package com.example.projetkaddem.services;

import com.example.projetkaddem.entities.Departement;
import com.example.projetkaddem.entities.Etudiant;
import com.example.projetkaddem.repositories.DepartementRepository;
import com.example.projetkaddem.repositories.EtudiantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImp implements IEtudiantService{
  private final EtudiantRepository etudiantRepository;
  private final DepartementRepository departementRepository;


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

    @Override
    public Etudiant assignerEtudiantDepartement(Integer idEtudiant, Integer idDepartement) {
        Etudiant etudiant = etudiantRepository.findById(idEtudiant).orElse(null);
        Departement departement= departementRepository.findById(idDepartement).orElse(null);
        etudiant.setDepartement(departement);
        return etudiantRepository.save(etudiant);
    }
}
