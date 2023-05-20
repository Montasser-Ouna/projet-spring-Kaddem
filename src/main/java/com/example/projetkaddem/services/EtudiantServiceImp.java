package com.example.projetkaddem.services;

import com.example.projetkaddem.entities.Contrat;
import com.example.projetkaddem.entities.Departement;
import com.example.projetkaddem.entities.Equipe;
import com.example.projetkaddem.entities.Etudiant;
import com.example.projetkaddem.repositories.ContratRepository;
import com.example.projetkaddem.repositories.DepartementRepository;
import com.example.projetkaddem.repositories.EquipeRepository;
import com.example.projetkaddem.repositories.EtudiantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImp implements IEtudiantService{
  private final EtudiantRepository etudiantRepository;
  private final DepartementRepository departementRepository;
 private final EquipeRepository equipeRepository;
  private final ContratRepository contratRepository;

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
  @Override
  @Transactional
    public Etudiant addAndAssignEtudiantToContratAndEquipe(Etudiant etudiant,Integer idContrat, Integer idEquipe)
    {
        etudiantRepository.save(etudiant);
        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
  //affectation avec contrat
        contrat.setEtudiant(etudiant);
        contratRepository.save(contrat);

        //affectation avec equipe
        Set<Equipe> equipes = new HashSet<>();
        equipes.add(equipe);
        etudiant.setEquipes(equipes);
        return etudiant;
    }

    @Override
    @Transactional
    public Etudiant addAndAssignEtudiantToContratAndEquipeandDep(Etudiant etudiant,Integer idContrat, Integer idEquipe)
    {
        Departement departement = departementRepository.findById(etudiant.getDepartement().getIdDepartement()).orElse(null);
        etudiant.setDepartement(departement);

        etudiantRepository.save(etudiant);
        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        //affectation avec contrat
        contrat.setEtudiant(etudiant);
        contratRepository.save(contrat);

        //affectation avec equipe
        Set<Equipe> equipes = new HashSet<>();
        equipes.add(equipe);
        etudiant.setEquipes(equipes);
        return etudiant;
    }
}
