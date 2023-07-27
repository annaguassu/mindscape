package com.techhive.mindscape.services;

import com.techhive.mindscape.model.Membro;
import com.techhive.mindscape.repository.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembroServices {

    private final MembroRepository membroRepository;

    @Autowired
    public MembroServices(MembroRepository membroRepository) {
        this.membroRepository = membroRepository;
    }

    public Membro adicionarMembro(Membro membro) {
        return membroRepository.save(membro);
    }
}
