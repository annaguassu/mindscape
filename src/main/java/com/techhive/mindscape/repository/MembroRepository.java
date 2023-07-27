package com.techhive.mindscape.repository;

import com.techhive.mindscape.model.Membro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembroRepository extends JpaRepository<Membro, Long> {
}
