package com.javaexpressocafe.api.service.implementation;

import com.javaexpressocafe.api.model.Ingrediente;
import com.javaexpressocafe.api.repository.IngredienteRepository;
import com.javaexpressocafe.api.repository.ProdutoRepository;
import com.javaexpressocafe.api.service.IngredienteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Implementação da interface IngredienteService utilizada para persistência de um Ingrediente
 * @author Matheus Marques
 * @since 20/02/2022
 */

@Service
public class IngredienteServiceImplementation implements IngredienteService {

    @Autowired
    IngredienteRepository ingredienteRepository;

    @Override
    public List<Ingrediente> listAll() {
        return ingredienteRepository.findAll();
    }

    @Override
    public Ingrediente create(Ingrediente ingrediente) {
        return ingredienteRepository.save(ingrediente);
    }

    @Override
    public Ingrediente getByUUID(UUID id) {
        return ingredienteRepository.getById(id);
    }

    @Override
    public Ingrediente update(UUID id, Ingrediente ingrediente) {
        Ingrediente updatedIngrediente = getByUUID(id);

        BeanUtils.copyProperties(ingrediente, updatedIngrediente, "id");

        return ingredienteRepository.save(updatedIngrediente);
    }

    @Override
    public void delete(UUID id) {
        Ingrediente ingredienteToBeDeleted = getByUUID(id);
        ingredienteRepository.delete(ingredienteToBeDeleted);
    }

    public Ingrediente getByNome(String nome) {
        return ingredienteRepository.getByNome(nome);
    }

    public void createAll(List<Ingrediente> ingredientes) {
        ingredienteRepository.saveAll(ingredientes);
    }
}
