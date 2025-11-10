package com.cms.model;

// Clase que representa una imagen dentro del CMS
public class Imagen extends Contenido {
    private String resolucion;
    private String formato;

    public Imagen(String titulo, String autor, String categoria, String resolucion, String formato) {
        super(titulo, autor, categoria);
        this.resolucion = resolucion;
        this.formato = formato;
    }

    @Override
    public void publicar() {
        System.out.println("Mostrando imagen: " + getTitulo() + " [" + resolucion + " - " + formato + "]");
    }

    @Override
    public void editar(String nuevaResolucion) {
        this.resolucion = nuevaResolucion;
        System.out.println("La resolución de la imagen ha sido actualizada.");
    }
}
