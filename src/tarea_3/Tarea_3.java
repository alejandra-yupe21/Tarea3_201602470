/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_3;

import java.util.*;


public class Tarea_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String[] VectorUsuario = new String[5];
        String nombre;
        String buscar;
        int opcion = 0;
        boolean cerrar = true;
        boolean existe = false;
        System.out.println("        *****  TAREA 3  *****       ");
        System.out.println("\n              201602470           ");
        System.out.println("\n            1. Usuarios");
        System.out.println("            2. Palabras Palindromas");
        System.out.println("            3. Salir");

        while (cerrar) {
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:

                    switch (opcion) {
                        case 1:
                            boolean close = true;
                            while (close) {
                                System.out.println("     *****  MENÚ DE USUARIOS  *****");
                                System.out.println("\n            1. Ingresar Usuarios");
                                System.out.println("            2. Mostrar todos los Usuarios");
                                System.out.println("            3. Mostrar un Usuario Personalizado");
                                System.out.println("            4. Menú Principal");
                                System.out.println("            5. Salir");

                                opcion = sc.nextInt();
                                switch (opcion) {
                                    case 1:

                                        for (int i = 0; i < VectorUsuario.length; i++) {
                                            System.out.println("            Ingresar Usuarios           ");
                                            nombre = teclado.nextLine();
                                            VectorUsuario[i] = nombre;

                                        }
                                        System.out.println("            \n           ");
                                        break;

                                    case 2:
                                        System.out.println("            \n           ");
                                        for (int i = 0; i < VectorUsuario.length; i++) {
                                            System.out.println(i + 1 + ". " + VectorUsuario[i]);
                                        }
                                        System.out.println("            \n           ");
                                        break;

                                    case 3:
                                        System.out.println("        Mostrar un Usuario Personalizado");
                                        System.out.println("\n            Ingresar Usuario: ");
                                        buscar = teclado.nextLine();

                                        for (int i = 0; i < VectorUsuario.length; i++) {

                                            if (buscar.equalsIgnoreCase(VectorUsuario[i])) {
                                                System.out.println("\n        Usuario \n\n " + VectorUsuario[i]);
                                                existe = true;
                                            }

                                        }

                                        if (existe == false) {
                                            System.out.println(" \n\nERROR! No existe ningún usuario con esa coincidencia");
                                        }
                                        System.out.println("            \n           ");
                                        break;

                                    case 4:
                                        boolean op2 = true;
                                        while (op2) {
                                            System.out.println("            \n           ");
                                            System.out.println("        *****  TAREA 3  *****       ");
                                            System.out.println("\n              201602470           ");
                                            System.out.println("\n            1. Usuarios");
                                            System.out.println("            2. Palabras Palindromas");
                                            System.out.println("            3. Salir");
                                            break;
                                        }
                                        op2 = false;

                                    case 5:

                                        close = false;
                                       
                                }

                            }
                            break;
                    }
                    break;

                case 2:

                    Scanner leer = new Scanner(System.in);
                    String palabra = "";
                    String palindromo = "";
                    System.out.println("            \n           ");
                    System.out.println("        *****  PALABRAS PALINDROMAS  *****");
                    System.out.println("\n               Ingresar Palabra");
                    palabra = leer.nextLine();

                    for (int i = palabra.length() - 1; i >= 0; i--) {
                        palindromo += palabra.charAt(i);
                    }

                    if (palabra.equalsIgnoreCase(palindromo)) {
                        System.out.println("\n        La palabra SI ES PALINDROMA!!!");
                    } else {
                        System.out.println("\n        La palabra NO ES PALINDROMA!!!");
                    }
                    boolean op2 = true;
                    while (op2) {
                        System.out.println("            \n           ");
                        System.out.println("        *****  TAREA 3  *****       ");
                        System.out.println("\n              201602470           ");
                        System.out.println("\n            1. Usuarios");
                        System.out.println("            2. Palabras Palindromas");
                        System.out.println("            3. Salir");
                        break;
                    }
                    op2 = false;

                    break;

                case 3:
                    cerrar = false;
                    break;
            }

        }
    }
}
