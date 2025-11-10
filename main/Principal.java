package com.cms.main;

import com.cms.controller.*;
import com.cms.model.*;
import com.cms.view.*;
import java.util.Scanner;

// Clase principal del sistema CMS, con menú por consola
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContenidoController controller = new ContenidoController();
        CMSVista vista = new CMSVista();

        boolean continuar = true;
        while (continuar) {
            int opcion = vista.mostrarMenu();
            sc.nextLine(); // limpia el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Categoría: ");
                    String categoria = sc.nextLine();
                    System.out.print("Tipo (1=Articulo, 2=Video, 3=Imagen): ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Texto: ");
                        String texto = sc.nextLine();
                        controller.agregarContenido(new Articulo(titulo, autor, categoria, texto));
                    } else if (tipo == 2) {
                        System.out.print("Duración (min): ");
                        double dur = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Formato: ");
                        String formato = sc.nextLine();
                        controller.agregarContenido(new Video(titulo, autor, categoria, dur, formato));
                    } else if (tipo == 3) {
                        System.out.print("Resolución: ");
                        String res = sc.nextLine();
                        System.out.print("Formato: ");
                        String formato = sc.nextLine();
                        controller.agregarContenido(new Imagen(titulo, autor, categoria, res, formato));
                    } else {
                        System.out.println("Tipo no válido.");
                    }
                    break;

                case 2:
                    controller.mostrarTodos();
                    break;

                case 3:
                    System.out.print("Ingrese categoría: ");
                    String cat = sc.nextLine();
                    controller.buscarPorCategoria(cat);
                    break;

                case 4:
                    System.out.print("Ingrese título a eliminar: ");
                    String eliminar = sc.nextLine();
                    controller.eliminarContenido(eliminar);
                    break;

                case 5:
                    continuar = false;
                    System.out.println("Saliendo del sistema CMS...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
        sc.close();
    }
}
