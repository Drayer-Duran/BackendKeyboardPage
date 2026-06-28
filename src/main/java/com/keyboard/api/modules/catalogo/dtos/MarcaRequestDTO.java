package com.keyboard.api.modules.catalogo.dtos;


public class MarcaRequestDTO 
{
    //Notblamc es para verificar que el nombre recibido no sea nulo o vacio
    @NotBlank(message = "El nombre de la marca es obligatorio")
    @Size(max = 100, message ="El nombre no puede superar los 100 caracteres")
    private String nombre;



    @NotBlank(message = "El slug es obligatorio")
    @Size(max = 120, message = "El slug no puede superar los 120 caracteres")
    private String slug;


    //En caso de la marca tenga o no logo
    private String logoUrl;


    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }



    @PostMapping("/api/marcas")
    public void crearMarca(@Valid RequestBody MarcaRequestDTO datosQueLlegan){
        //
    }

}
