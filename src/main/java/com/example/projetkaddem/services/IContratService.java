package com.example.projetkaddem.services;

import com.example.projetkaddem.entities.Contrat;

import java.util.List;

public interface IContratService {
    List<Contrat> getAllContrats();
    Contrat addContrat(Contrat contrat);
    Contrat updateContrat(Contrat contrat);
    Contrat getContrat(Integer idContrat);
    void deleteContrat(Long id);
}
