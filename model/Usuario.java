package com.cms.model;

// Clase abstracta que representa un usuario del sistema
public abstract class Usuario {
    private String nombre;
    private String rol;

    public Usuario(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getNombre() { return nombre; }
    public String getRol() { return rol; }

    // Métodos que se definirán de forma distinta en cada tipo de usuario
    public abstract void crearContenido();
    public abstract void editarContenido();

    @Override
    public String toString() {
        return nombre + " (" + rol + ")";
    }
}
