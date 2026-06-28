package com.keyboard.api.modules.catalogo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias", schema = "tienda")
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_id")
    private Long categoriaId; // 

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "slug", nullable = false, unique = true, length = 120)
    private String slug;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "imagen_url", columnDefinition = "TEXT")
    private String imagenUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "padre_id")
    private Categoria padre;

    @Column(name = "activa", nullable = false)
    private Boolean activa = true;

    @Column(name = "orden", nullable = false)
    private Short orden = 0; 

    public Categoria() {
        //Constructor vacio
    }

    public Categoria(String nombre, String slug) {
        this.nombre = nombre;
        this.slug = slug;
    }

    // ==========================================
    // GETTERS Y SETTERS (Actualizados a camelCase)
    // ==========================================
    
    public Long getCategoriaId() { return categoriaId; }
    public void setCategoriaId(Long categoriaId) { this.categoriaId = categoriaId; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getSlug() { return slug; }
    public void setSlug(String slug) { this.slug = slug; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getImagenUrl() { return imagenUrl; }
    public void setImagenUrl(String imagenUrl) { this.imagenUrl = imagenUrl; }

    public Categoria getPadre() { return padre; }
    public void setPadre(Categoria padre) { this.padre = padre; }

    public Boolean getActiva() { return activa; }
    public void setActiva(Boolean activa) { this.activa = activa; }

    public Short getOrden() { return orden; }
    public void setOrden(Short orden) { this.orden = orden; }
}