package com.javaexpressocafe.api.service;


import com.javaexpressocafe.api.model.Ingrediente;

import java.util.List;
import java.util.UUID;

public interface IngredienteService {

    public List<Ingrediente> listAll();
    public Ingrediente create(Ingrediente ingrediente);
    public Ingrediente getByUUID(UUID id);
    public Ingrediente update(UUID id, Ingrediente ingrediente);
    public void delete(UUID id);
}
