package com.cms.model;

// Clase que representa un video dentro del CMS
public class Video extends Contenido {
    private double duracion;
    private String formato;

    public Video(String titulo, String autor, String categoria, double duracion, String formato) {
        super(titulo, autor, categoria);
        this.duracion = duracion;
        this.formato = formato;
    }

    @Override
    public void publicar() {
        System.out.println("Reproduciendo video: " + getTitulo() + " (" + duracion + " min, " + formato + ")");
    }

    @Override
    public void editar(String nuevoFormato) {
        this.formato = nuevoFormato;
        System.out.println("El formato del video se ha actualizado a " + nuevoFormato);
    }
}
