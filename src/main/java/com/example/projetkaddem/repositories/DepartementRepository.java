package com.example.projetkaddem.repositories;

import com.example.projetkaddem.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {
}