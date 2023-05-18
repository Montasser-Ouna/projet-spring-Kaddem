package com.example.projetkaddem.services;

import com.example.projetkaddem.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retriveAllUniversites();
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    Universite retriveUniversite(Integer idUniv);
    void deleteUniversite(Long id);

}