package com.keyboard.api.modules.catalogo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "marcas", schema = "tienda")//esquema PostgresSQL

public class Marca
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Serial de PostgresSQL

    @Column(name = "marca_id")
    private Long marcaId;

    @Column(name = "nombre_marca", nullable = false, unique = true, length = 100)
    private String nombreMarca;

    @Column(name = "slug_marca", nullable = false, unique = true, length = 120)
    private String slugMarca;

    @Column(name = "logo_url", columnDefinition = "TEXT") //Mapea el url en tipo texto
    private String logoUrl;

    @Column(name = "activa" , nullable = false)
    private Boolean activa = true; //valores por defecto


public Marca()
{
}


public Marca(String nombreMarca, String slugMarca, String logoUrl, Boolean activa)
{
    this.nombreMarca = nombreMarca;
    this.slugMarca = slugMarca;
    this.logoUrl = logoUrl;
    this.activa = true;
}
    //id

    public Long getMarcaId()
     { 
        return marcaId; 
     }
    public void setMarcaId(Long marcaId) 
    { 
        this.marcaId = marcaId; 
    }
    //nombre_marca
    public String getNombreMarca()
    {
        return nombreMarca;
    }
    public void setNombreMarca(String nombreMarca)
    {
        this.nombreMarca = nombreMarca;
    }

    //slug_marca
    public String getSlugMarca()
    {
        return slugMarca;
    }
    public void setSlugMarca(String slugMarca)
    {
        this.slugMarca = slugMarca;
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