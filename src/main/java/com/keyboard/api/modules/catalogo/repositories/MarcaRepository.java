package com.keyboard.api.modules.catalogo.repositories;

import com.tecladostore.tienda.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface MarcaRepository extends JpaRepository <Marca, Long>
{
    //Springboot lee e nombre del metodo y genera un sql de manera automatica
    //SELET * FROM tienda.marcas WHERE slug = ?;
    //para prevenir SQL Injection
    Optinal<Marca> findBySlug(String slug);

    //Validar antes de insertar
    boolean existByNombre(String nombre);
}