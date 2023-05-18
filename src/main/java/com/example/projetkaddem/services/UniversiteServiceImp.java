package com.example.projetkaddem.services;

import com.example.projetkaddem.entities.Departement;
import com.example.projetkaddem.entities.Universite;
import com.example.projetkaddem.repositories.DepartementRepository;
import com.example.projetkaddem.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class UniversiteServiceImp implements IUniversiteService {
  private final UniversiteRepository universiteRepository;
  private final DepartementRepository departementRepository;


    @Override
    public List<Universite> retriveAllUniversites() {
        return null;
    }

    @Override
    public Universite addUniversite(Universite universite) {
        return null;
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return null;
    }

    @Override
    public Universite retriveUniversite(Integer idUniv) {
        return null;
    }

    @Override
    public void deleteUniversite(Long id) {

    }



    @Override
    public void assignUniversiteToDepartement(Integer idUniv, Integer idDepartement) {
    Universite universite = universiteRepository.findById(idUniv).orElse(null);
    Departement departement = departementRepository.findById(idDepartement).orElse(null);
    if (universite.getDepartements() == null){
        Set<Departement> departementSet = new HashSet<>();
        departementSet.add(departement);
        universite.setDepartements(departementSet);

    }
    else {
        universite.getDepartements().add(departement);
    }
        universiteRepository.save(universite);
    }
}
