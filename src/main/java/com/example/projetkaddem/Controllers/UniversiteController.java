package com.example.projetkaddem.Controllers;

import com.example.projetkaddem.entities.Universite;
import com.example.projetkaddem.services.IUniversiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {
    private final IUniversiteService iUniversiteService;

    @PutMapping("/assignUniversiteToDepartement/{idUniv}/{idDepartement}")
    void assignUniversiteToDepartement(@PathVariable("idUniv") Integer idUniv,@PathVariable("idDepartement")  Integer idDepartement) {
        iUniversiteService.assignUniversiteToDepartement(idUniv, idDepartement);
    }

    @PostMapping("/add")
    Universite addOrUpdateUniversite(@RequestBody Universite universite) {
        return iUniversiteService.addOrUpdateUniversite(universite);
    }

}
