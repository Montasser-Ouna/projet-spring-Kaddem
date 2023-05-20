package com.example.projetkaddem.Controllers;

import com.example.projetkaddem.entities.Contrat;
import com.example.projetkaddem.services.IContratService;
import com.example.projetkaddem.services.IEtudiantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/contrat")
public class ContratController {
    private final IContratService iContratService;
    //private final IEtudiantService iEtudiantService;

    @PutMapping("/assignContratToEtudiant/{nomE}/{prenomE}")
    public Contrat assignContratToEtudiant(@RequestBody Contrat ce, @PathVariable("nomE") String nomE,@PathVariable("prenomE") String prenomE) {
        return iContratService.assignContratToEtudiant(ce, nomE, prenomE);
    }


}
