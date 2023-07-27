package com.techhive.mindscape.controller;

import com.techhive.mindscape.model.Membro;
import com.techhive.mindscape.services.MembroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/membro")
public class MembroController {

    private final MembroServices membroServices;

    @Autowired
    public MembroController(MembroServices membroServices) {
        this.membroServices = membroServices;
    }

    @PostMapping
    public Membro adicionarMembro(@RequestBody Membro membro) {
        return membroServices.adicionarMembro(membro);
    }
}
