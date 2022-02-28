package com.sofka.Taller3;

import java.util.Scanner;

public class Ciclos5 {
    int opcion;
    String nombre;

    Scanner leer = new Scanner(System.in);

    public void menu(){
        do {
            System.out.println("Menú de usuario");
            System.out.println("Elija una opción: ");
            System.out.println("1. Capturar nombre");
            System.out.println("2. Saludar persona");
            System.out.println("3. Salir del sistema");

            opcion = Integer.parseInt(leer.nextLine());
            switch (opcion){
                case 1:
                    System.out.println("Ingrese un usuario: ");
                    nombre = leer.nextLine();
                    break;
                case 2:
                    if(nombre == ""){
                        System.out.println("No hay a quien saludar, ingrese un nombre");
                    }else
                        System.out.println("Hola, "+nombre+ " ¿como estas?");
                    break;
                case 3:
                    System.out.println("...Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while(opcion !=3);
    }
}
