package com.javaexpressocafe.api.controller;

import com.javaexpressocafe.api.model.Ingrediente;
import com.javaexpressocafe.api.model.Produto;
import com.javaexpressocafe.api.service.implementation.IngredienteServiceImplementation;
import com.javaexpressocafe.api.service.implementation.ProdutoServiceImplementation;
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
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoServiceImplementation produtoServiceImplementation;

    @Autowired
    IngredienteServiceImplementation ingredienteServiceImplementation;

    @GetMapping
    public List<Produto> getAllProdutos() {
        return produtoServiceImplementation.listAll();
    }

    @GetMapping("/{id}")
    public Produto getAllProdutos(@PathVariable(value= "id") UUID id) {
        return produtoServiceImplementation.getByUUID(id);
    }

    @PostMapping
    public Produto saveProduto(@RequestBody Produto produto) {
        return produtoServiceImplementation.create(produto);
    }

    @PutMapping("/{id}")
    public Produto updateproduto(@PathVariable(value= "id") UUID id, @RequestBody Produto produto) {
        return produtoServiceImplementation.update(id, produto);
    }

    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable(value= "id") UUID id) {
        produtoServiceImplementation.delete(id);
    }


}
