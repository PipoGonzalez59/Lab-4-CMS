package com.cms.view;

import java.util.Scanner;

// Vista simple para manejar las interacciones del usuario
public class CMSVista {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== MENÚ PRINCIPAL CMS ===");
        System.out.println("1. Crear contenido");
        System.out.println("2. Mostrar todos los contenidos");
        System.out.println("3. Buscar por categoría");
        System.out.println("4. Eliminar contenido");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        return sc.nextInt();
    }
}
