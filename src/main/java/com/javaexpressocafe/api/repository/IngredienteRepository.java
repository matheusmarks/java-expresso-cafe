package com.javaexpressocafe.api.repository;

import com.javaexpressocafe.api.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Matheus Marques
 * @since 20/02/2022
 */

@Repository
public interface IngredienteRepository extends JpaRepository<Ingrediente, UUID> {

    @Query("select i from Ingrediente i where i.nome = :nome")
    public Ingrediente getByNome(String nome);
}
