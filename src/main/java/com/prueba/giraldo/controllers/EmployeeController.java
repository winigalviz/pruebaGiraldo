package com.prueba.giraldo.controllers;

import com.prueba.giraldo.entities.EmployeeEntity;
import com.prueba.giraldo.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value ="/employee")
public class EmployeeController {
    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public @ResponseBody Iterable<EmployeeEntity> getAll() {
        return this.repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<EmployeeEntity> getById(@PathVariable("id") Integer id) {
        return this.repository.findById(id);
    }
}
