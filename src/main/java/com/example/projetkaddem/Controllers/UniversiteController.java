package com.example.projetkaddem.Controllers;

import com.example.projetkaddem.services.IUniversiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {
    private final IUniversiteService iUniversiteService;

    @PutMapping("/assignUniversiteToDepartement/{idUniv}/{idDepartement}")
    void assignUniversiteToDepartement(@PathVariable("idUniv") Integer idUniv,@PathVariable("idDepartement")  Integer idDepartement) {
        iUniversiteService.assignUniversiteToDepartement(idUniv, idDepartement);
    }

}
