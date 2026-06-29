package com.keyboard.api.modules.catalogo.repositories;

import com.keyboard.api.modules.catalogo.entities.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface MarcaRepository extends JpaRepository <Marca, Long>
{
    //Springboot lee e nombre del metodo y genera un sql de manera automatica
    //SELET * FROM tienda.marcas WHERE slug = ?;
    //para prevenir SQL Injection
    Optional<Marca> findBySlugMarca(String slugMarca);

    //Validar antes de insertar
    boolean existsByNombreMarca(String nombreMarca);
}