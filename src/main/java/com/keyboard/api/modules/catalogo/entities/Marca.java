package com.keyboard.api.modules.catalogo.entities;

import jakarta.persistence.*;
import java.time.localtime;

@Entity
@Table(name = "marcas", schema = "tienda")//esquema PostgresSQL

public class Marca
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Serial de PostgresSQL

    @Column(name = "marca_id")
    private Long marcaId;

    @Column(name = "nombre_marca", nullable = false, unique = true, length = 100)
    private String nombre_marca;

    @Column(name = "slug_marca", nullable = false, unique = true, length = 120)
    private String slug_marca;

    @Column(name = "logo_url", columnDefinition = "TEXT") //Mapea el url en tipo texto
    private String logoUrl;

    @Column(name = "activa" , nullable = false)
    private Boolean activa = true; //valores por defecto


public Marca()
{
}


public Marca(String nombre_marca, String slug_marca, String logoUrl, Boolean activa)
{
    this.nombre_marca = nombre_marca;
    this.slug_marca = slug_marca;
    this.logoUrl = logoUrl;
    this.activa = true;
}
    //id
    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
    this.id = id;
    }
    //nombre_marca
    public String getNombre_marca()
    {
        return nombre_marca;
    }
    public void setNombre_marca(String nombre_marca)
    {
        this.nombre_marca = nombre_marca;
    }

    //slug_marca
    public String getSlug_marca()
    {
        return slug_marca;
    }
    public void setSlug_marca(String slug_marca)
    {
        this.slug_marca = slug_marca;
    }

    //Url
    public String getLogoUrl()
    {
        return logoUrl;
    }
    public void setLogoUrl(String logoUrl)
    {
        this.logoUrl = logoUrl;
    }


    //EstaActiva
    public Boolean getActiva()
    {
        return activa;
    }
    public void setActiva(Boolean activa)
    {
        this.activa = activa;
    }
}