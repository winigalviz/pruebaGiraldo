package com.prueba.giraldo.repositories;

import com.prueba.giraldo.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> { }
