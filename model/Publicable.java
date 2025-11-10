package com.cms.model;

// Interfaz sencilla que define las acciones básicas para cualquier contenido
public interface Publicable {
    void publicar();
    void editar(String nuevoContenido);
}
