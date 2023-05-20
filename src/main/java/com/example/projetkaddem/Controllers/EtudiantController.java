package com.example.projetkaddem.Controllers;

import com.example.projetkaddem.entities.Etudiant;
import com.example.projetkaddem.repositories.EtudiantRepository;
import com.example.projetkaddem.services.IEtudiantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    private final IEtudiantService iEtudiantService;

    @PostMapping("/add")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return iEtudiantService.addEtudiant(etudiant);

    }

    @PutMapping("/update")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return iEtudiantService.updateEtudiant(etudiant);
    }

 @GetMapping("/get/{id}")
    Etudiant getEtudiant(@PathVariable("id") Integer idEtudiant) {
        return iEtudiantService.retriveEtudiant(idEtudiant);
    }

    @GetMapping("/all")
    List<Etudiant> getAllEtudiants() {
        return iEtudiantService.retriveAllEtudiants();
    }

    @DeleteMapping("/delete/{id}")
    void deleteEtudiant(@PathVariable("id") Integer idEtudiant) {
        iEtudiantService.deleteEtudiant(idEtudiant);
    }

    @PutMapping("/assignerEtudiantDepartement/{idEtudiant}/{idDepartement}")
    public Etudiant assignerEtudiantDepartement(@PathVariable("idEtudiant") Integer idEtudiant, @PathVariable("idDepartement") Integer idDepartement) {
        return iEtudiantService.assignerEtudiantDepartement(idEtudiant, idDepartement);
    }

    @PutMapping("/addAndAssignEtudiantToContratAndEquipe/{idContrat}/{idEquipe}")
    public Etudiant addAndAssignEtudiantToContratAndEquipe(@RequestBody Etudiant etudiant,@PathVariable("idContrat") Integer idContrat, @PathVariable("idEquipe") Integer idEquipe) {
        return iEtudiantService.addAndAssignEtudiantToContratAndEquipe(etudiant, idContrat, idEquipe);
    }
    @PutMapping("/addAndAssignEtudiantToContratAndEquipeandDep/{idContrat}/{idEquipe}")
    public Etudiant addAndAssignEtudiantToContratAndEquipeandDep(@RequestBody Etudiant etudiant,@PathVariable("idContrat") Integer idContrat, @PathVariable("idEquipe") Integer idEquipe) {
        return iEtudiantService.addAndAssignEtudiantToContratAndEquipeandDep(etudiant, idContrat, idEquipe);
    }

    @GetMapping("/getEtudiantByDepartement/{idDepartement}")
    public List<Etudiant> getEtudiantByDepartement(Integer idDepartement) {
        return iEtudiantService.getEtudiantByDepartement(idDepartement);
    }
}

