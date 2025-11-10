package com.cms.model;

// Usuario con permisos limitados para crear y editar
public class Editor extends Usuario {

    public Editor(String nombre) {
        super(nombre, "Editor");
    }

    @Override
    public void crearContenido() {
        System.out.println("El editor puede crear contenidos.");
    }

    @Override
    public void editarContenido() {
        System.out.println("El editor puede editar sus propios contenidos.");
    }
}
