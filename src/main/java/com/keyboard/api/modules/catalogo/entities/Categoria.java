package com.keyboard.api.modules.catalogo.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "categorias", schema = "tienda")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoria_id;

    @Column(name = "nombre_categoria", nullable = false)
    private String nombre_categoria;

    @Column(name = "slug_categoria", nullable = false, unique = true)
    private String slug_categoria;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "imagen_url")
    private String imagenUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "padre_id", referencedColumnName = "categoria_id")
    private Categoria padre;

    @Column(name = "activa", nullable = false, default = true)
    private Boolean activa = true;

    @Column(name = "orden", nullable = false, default = 0)
    private Short orden;

    public Categoria() {
        // Constructor vacío necesario para el Hibernate
    }

    public Categoria(String nombre_categoria, String slug_categoria) {
        this.nombre_categoria = nombre_categoria;
        this.slug_categoria = slug_categoria;
    }

    public Long getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Long categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getSlug_categoria() {
        return slug_categoria;
    }

    public void setSlug_categoria(String slug_categoria) {
        this.slug_categoria = slug_categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public Categoria getPadre() {
        return padre;
    }

    public void setPadre(Categoria padre) {
        this.padre = padre;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public Short getOrden() {
        return orden;
    }

    public void setOrden(Short orden) {
        this.orden = orden;
    }
}
