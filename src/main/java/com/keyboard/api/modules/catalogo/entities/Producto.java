package com.keyboard.api.modules.catalogo.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "productos", schema = "tienda")
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "producto_id")
    private Long productoId; // CAMBIO: camelCase en Java


    @Column(name = "sku", nullable = false, unique = true, length = 80)
    private String sku;

    @Column(name = "slug", nullable = false, unique = true, length = 220)
    private String slug;

    @Column(name = "nombre", nullable = false, unique = true, length = 200)
    private String nombreProducto; 

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id")
    private Categoria categoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "marca_id", referencedColumnName = "marca_id")
    private Marca marca;

    @Column(name = "precio_base", nullable = false, precision = 10, scale = 2)
    private BigDecimal precioBase;

    public Producto() {
        // Constructor vacío necesario para Hibernate
    }

    // Actualizamos el constructor con los campos obligatorios
    public Producto(Categoria categoria, Marca marca, String nombreProducto, String sku, String slug, BigDecimal precioBase) {
        this.categoria = categoria;
        this.marca = marca;
        this.nombreProducto = nombreProducto;
        this.sku = sku;
        this.slug = slug;
        this.precioBase = precioBase;
    }

    // ==========================================
    // GETTERS Y SETTERS (Corregidos a camelCase)
    // ==========================================
    public Long getProductoId() 
    { return productoId; }
    public void setProductoId(Long productoId) 
    { this.productoId = productoId; }

    public String getSku()
    { return sku; }
    public void setSku(String sku)
    { this.sku = sku; }

    public String getSlug() 
    { return slug; }
    public void setSlug(String slug) 
    { this.slug = slug; }

    public String getNombreProducto() 
    { return nombreProducto; }
    public void setNombreProducto(String nombreProducto) 
    { this.nombreProducto = nombreProducto; } // CAMBIO: Parámetro agregado

    public Categoria getCategoria() 
    { return categoria; }
    public void setCategoria(Categoria categoria) 
    { this.categoria = categoria; }

    public Marca getMarca() 
    { return marca; }
    public void setMarca(Marca marca) 
    { this.marca = marca; }

    public BigDecimal getPrecioBase() 
    { return precioBase; }
    public void setPrecioBase(BigDecimal precioBase) 
    { this.precioBase = precioBase; }
}