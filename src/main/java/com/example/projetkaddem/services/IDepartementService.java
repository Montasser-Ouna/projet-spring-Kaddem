package com.example.projetkaddem.services;

import com.example.projetkaddem.entities.Departement;

import java.util.List;

public interface IDepartementService {
    List<Departement> getAllDepartements();
    Departement addDepartement(Departement departement);
    Departement  updateDepartement(Departement departement);
    Departement getDepartement(Integer idDepartement);
    void deleteDepartement(Long id);
}
