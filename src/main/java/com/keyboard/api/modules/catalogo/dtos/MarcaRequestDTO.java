package com.keyboard.api.modules.catalogo.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class MarcaRequestDTO {

    @NotBlank(message = "El nombre de la marca es obligatorio")
    @Size(max = 100, message = "El nombre no puede superar los 100 caracteres")
    private String nombre;

    @NotBlank(message = "El slug es obligatorio")
    @Size(max = 120, message = "El slug no puede superar los 120 caracteres")
    private String slug;

    private String logoUrl;

    // ==========================================
    // GETTERS Y SETTERS
    // ==========================================
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getSlug() { return slug; }
    public void setSlug(String slug) { this.slug = slug; }

    public String getLogoUrl() { return logoUrl; }
    public void setLogoUrl(String logoUrl) { this.logoUrl = logoUrl; }
}