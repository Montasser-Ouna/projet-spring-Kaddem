package com.example.projetkaddem.Controllers;

import com.example.projetkaddem.entities.Etudiant;
import com.example.projetkaddem.repositories.EtudiantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    private final EtudiantRepository etudiantRepository;

    @PostMapping("/add")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantRepository.save(etudiant);

    }

    @PutMapping("/update")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

 @GetMapping("/get/{id}")
    Etudiant getEtudiant(@PathVariable("id") Integer idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @GetMapping("/all")
    List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    void deleteEtudiant(@PathVariable("id") Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
}

