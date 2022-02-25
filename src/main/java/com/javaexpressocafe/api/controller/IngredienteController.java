package com.javaexpressocafe.api.controller;

import com.javaexpressocafe.api.model.Ingrediente;
import com.javaexpressocafe.api.service.implementation.IngredienteServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author Matheus Marques
 * @since 20/02/2022
 */

@RestController
@RequestMapping("/ingrediente")
public class IngredienteController {

    @Autowired
    IngredienteServiceImplementation ingredienteServiceImplementation;

    @GetMapping
    public List<Ingrediente> getAllIngredientes() {
        return ingredienteServiceImplementation.listAll();
    }

    @PostMapping
    public Ingrediente saveIngrediente(@RequestBody Ingrediente ingrediente) {
        return ingredienteServiceImplementation.create(ingrediente);
    }

    @GetMapping("/{id}")
    public Ingrediente getByIngredienteByUUID(@PathVariable(value= "id") UUID id) {
        return ingredienteServiceImplementation.getByUUID(id);
    }

    @PutMapping("/{id}")
    public Ingrediente updateIngrediente(@PathVariable(value= "id") UUID id, @RequestBody Ingrediente ingrediente) {
        return ingredienteServiceImplementation.update(id, ingrediente);
    }

    @DeleteMapping("/{id}")
    public void deleteIngrediente(@PathVariable(value= "id") UUID id) {
        ingredienteServiceImplementation.delete(id);
    }
}
