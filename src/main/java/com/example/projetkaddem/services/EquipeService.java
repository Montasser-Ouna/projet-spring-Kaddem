package com.example.projetkaddem.services;

import com.example.projetkaddem.entities.Equipe;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EquipeService implements IEquipeService{
    @Override
    public List<Equipe> getAllEquipes() {
        return null;
    }

    @Override
    public Equipe addEquipe(Equipe equipe) {
        return null;
    }

    @Override
    public Equipe updateEquipe(Equipe equipe) {
        return null;
    }

    @Override
    public Equipe getEquipe(Integer idEquipe) {
        return null;
    }

    @Override
    public void deleteEquipe(Integer idEquipe) {

    }


}
