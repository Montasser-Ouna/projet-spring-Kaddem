package com.example.projetkaddem.services;

import com.example.projetkaddem.entities.Contrat;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ContratServieImp implements IContratService{
    @Override
    public List<Contrat> getAllContrats() {
        return null;
    }

    @Override
    public Contrat addContrat(Contrat contrat) {
        return null;
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return null;
    }

    @Override
    public Contrat getContrat(Integer idContrat) {
        return null;
    }

    @Override
    public void deleteContrat(Long id) {

    }
}
