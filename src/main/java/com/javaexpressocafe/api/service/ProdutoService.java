package com.javaexpressocafe.api.service;

import com.javaexpressocafe.api.model.Produto;

import java.util.List;
import java.util.UUID;

/**
 * @author Matheus Marques
 * @since 20/02/2022
 */

public interface ProdutoService {
    public List<Produto> listAll();
    public Produto create(Produto produto);
    public Produto getByUUID(UUID id);
    public Produto update(UUID id, Produto produto);
    public void delete(UUID id);
}
