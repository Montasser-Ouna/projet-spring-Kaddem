package com.example.projetkaddem.services;

import com.example.projetkaddem.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    List<Equipe> getAllEquipes();
    Equipe addEquipe(Equipe equipe);
    Equipe updateEquipe(Equipe equipe);
    Equipe getEquipe(Integer idEquipe);
    void deleteEquipe(Integer idEquipe);
}
