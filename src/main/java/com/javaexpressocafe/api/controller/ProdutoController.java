package com.javaexpressocafe.api.controller;

import com.javaexpressocafe.api.model.Ingrediente;
import com.javaexpressocafe.api.model.Produto;
import com.javaexpressocafe.api.service.implementation.IngredienteServiceImplementation;
import com.javaexpressocafe.api.service.implementation.ProdutoServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoServiceImplementation produtoServiceImplementation;

    @GetMapping
    public List<Produto> getAllProdutos() {
        return produtoServiceImplementation.listAll();
    }

}
