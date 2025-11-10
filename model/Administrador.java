package com.cms.model;

// Usuario con permisos completos dentro del sistema
public class Administrador extends Usuario {

    public Administrador(String nombre) {
        super(nombre, "Administrador");
    }

    @Override
    public void crearContenido() {
        System.out.println("El administrador puede crear nuevos contenidos.");
    }

    @Override
    public void editarContenido() {
        System.out.println("El administrador puede editar y eliminar cualquier contenido.");
    }

    public void eliminarContenido() {
        System.out.println("El administrador ha eliminado un contenido.");
    }
}
