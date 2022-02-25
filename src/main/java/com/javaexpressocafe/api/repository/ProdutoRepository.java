package com.javaexpressocafe.api.repository;


import com.javaexpressocafe.api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Matheus Marques
 * @since 20/02/2022
 */

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
}
