package com.example.projetkaddem.services;

import com.example.projetkaddem.entities.Contrat;
import com.example.projetkaddem.entities.Etudiant;
import com.example.projetkaddem.repositories.ContratRepository;
import com.example.projetkaddem.repositories.EtudiantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ContratServieImp implements IContratService{
    private final ContratRepository contratRepository;
    private final EtudiantRepository etudiantRepository;
    @Override
    public List<Contrat> getAllContrats() {
        return null;
    }

    @Override
    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
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

    @Override
    public Contrat assignContratToEtudiant(Contrat ce, String nomE, String prenomE) {
      Etudiant etudiant = etudiantRepository.findByNomEAndPrenomE(nomE,prenomE);
       if(contratRepository.countByArchiveIsFalseAndEtudiant(etudiant)<5){
           ce.setEtudiant(etudiant);
           contratRepository.save(ce);
       }
        return ce;
    }


    @Override
    public Integer nbContratsValides(Date dateDebutContrat, Date datefinContrat) {
        return contratRepository.countByArchiveIsFalseAndDateDebutContratBetween(dateDebutContrat, datefinContrat);

    }

}
