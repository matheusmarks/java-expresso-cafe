package com.javaexpressocafe.api.service.implementation;

import com.javaexpressocafe.api.model.Produto;
import com.javaexpressocafe.api.repository.ProdutoRepository;
import com.javaexpressocafe.api.service.ProdutoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Implementação da interface ProdutoService utilizada para persistência de um Produto
 * @author Matheus Marques
 * @since 20/02/2022
 */

@Service
public class ProdutoServiceImplementation implements ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public List<Produto> listAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto create(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public Produto getByUUID(UUID id) {
        return produtoRepository.getById(id);
    }

    @Override
    public Produto update(UUID id, Produto produto) {
        Produto updatedProduto = getByUUID(id);

        BeanUtils.copyProperties(produto, updatedProduto, "id");

        return produtoRepository.save(updatedProduto);
    }

    @Override
    public void delete(UUID id) {
        Produto produtoToBeDeleted = getByUUID(id);
        produtoRepository.delete(produtoToBeDeleted);
    }
}
