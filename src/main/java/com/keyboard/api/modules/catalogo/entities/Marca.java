package com.tecladosstore.tienda.model;

import jakarta.persitence.*;
import java.time.localtime;

@Entity
@Table(name = "marcas", schema = "tienda")//esquema PostgresSQL

public class Marca
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Serial de PostgresSQL

    @Column(name = "marca_id")
    private Long id;

    @Column(name = "nombre", nulleable = false, unique = true, length = 100)
    private String nombre;

    @Column(name = "slug", nulleable = false, unique = true, length = 120)
    private String slug;

    @Column(name = "logo_url", columnDefinition = "TEXT") //Mapea el url en tiopo texto
    private String logoUrl;

    @Column(name = "activa" , nulleable = false)
    private Boolean activa = true; //valores por defecto


public Marca(String nombre, String slug, String logoUrl, Boolean activa)
{

}

public Marca(String nombre, String slug, String logoUrl, Boolean activa)
{
    this.nombre = nombre;
    this.slug = slug;
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
    //Nombre
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    //Slug
    public String getSlug()
    {
        return slug;
    }
    public void setSlug(String slug)
    {
        this.slug = slug;
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