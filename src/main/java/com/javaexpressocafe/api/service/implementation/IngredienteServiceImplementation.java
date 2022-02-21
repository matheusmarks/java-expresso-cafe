package com.javaexpressocafe.api.service.implementation;

import com.javaexpressocafe.api.model.Ingrediente;
import com.javaexpressocafe.api.model.Produto;
import com.javaexpressocafe.api.repository.IngredienteRepository;
import com.javaexpressocafe.api.repository.ProdutoRepository;
import com.javaexpressocafe.api.service.IngredienteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class IngredienteServiceImplementation implements IngredienteService {

    @Autowired
    IngredienteRepository ingredienteRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public List<Ingrediente> listAll() {
        return ingredienteRepository.findAll();
    }

    @Override
    public Ingrediente create(Ingrediente ingrediente) {
        Produto produto = produtoRepository.getById(ingrediente.getProduto().getId());
        ingrediente.setProduto(produto);

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
}
