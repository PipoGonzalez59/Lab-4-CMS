package com.cms.model;

// Clase que representa un artículo dentro del CMS
public class Articulo extends Contenido {
    private String texto;

    public Articulo(String titulo, String autor, String categoria, String texto) {
        super(titulo, autor, categoria);
        this.texto = texto;
    }

    @Override
    public void publicar() {
        System.out.println("Publicando artículo: " + getTitulo());
        System.out.println("Contenido: " + texto);
    }

    @Override
    public void editar(String nuevoTexto) {
        this.texto = nuevoTexto;
        System.out.println("El artículo ha sido modificado correctamente.");
    }
}
