package com.cms.model;

// Clase abstracta base que representa un contenido general en el CMS
public abstract class Contenido implements Publicable {
    private String titulo;
    private String autor;
    private String categoria;

    public Contenido(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    // Métodos de acceso comunes
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getCategoria() { return categoria; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    // Métodos abstractos que se definirán en las subclases
    public abstract void publicar();
    public abstract void editar(String nuevoContenido);

    @Override
    public String toString() {
        return "Título: " + titulo + " | Autor: " + autor + " | Categoría: " + categoria;
    }
}
