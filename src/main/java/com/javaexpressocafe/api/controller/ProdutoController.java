package com.javaexpressocafe.api.controller;

import com.javaexpressocafe.api.model.Ingrediente;
import com.javaexpressocafe.api.model.Produto;
import com.javaexpressocafe.api.service.implementation.IngredienteServiceImplementation;
import com.javaexpressocafe.api.service.implementation.ProdutoServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    @PostMapping
    public Produto saveProduto(@RequestBody Produto produto) {
        List<Ingrediente> ingredientes = produto.getIngredientes().stream().map(item ->
                        ingredienteServiceImplementation.getByNome(item.getNome())).collect(Collectors.toList());

        produto.addIngrediente(ingredientes.get(0));

        return produtoServiceImplementation.create(produto);
    }

}
