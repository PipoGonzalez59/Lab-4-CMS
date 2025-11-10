package com.cms.controller;

import com.cms.model.*;
import java.util.ArrayList;

// Clase encargada de manejar la lógica de los contenidos
public class ContenidoController {
    private ArrayList<Contenido> listaContenidos;

    public ContenidoController() {
        listaContenidos = new ArrayList<>();
    }

    // Agrega un nuevo contenido al sistema
    public void agregarContenido(Contenido c) {
        listaContenidos.add(c);
        System.out.println("Contenido agregado: " + c.getTitulo());
    }

    // Elimina un contenido por título
    public void eliminarContenido(String titulo) {
        listaContenidos.removeIf(c -> c.getTitulo().equalsIgnoreCase(titulo));
        System.out.println("Contenido eliminado: " + titulo);
    }

    // Muestra todos los contenidos guardados
    public void mostrarTodos() {
        System.out.println("\nLista de contenidos:");
        for (Contenido c : listaContenidos) {
            System.out.println("- " + c.toString());
        }
    }

    // Busca contenidos por categoría
    public void buscarPorCategoria(String categoria) {
        System.out.println("\nContenidos en la categoría '" + categoria + "':");
        for (Contenido c : listaContenidos) {
            if (c.getCategoria().equalsIgnoreCase(categoria)) {
                System.out.println(c.toString());
            }
        }
    }
}
