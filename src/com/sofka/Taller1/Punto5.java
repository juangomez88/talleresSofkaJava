package com.sofka.Taller1;

import java.util.Scanner;

public class Punto5 {
    String nombreMascota, tipoMascota, nombre;
    int edadMascota;
    Scanner leer = new Scanner(System.in);

    public Punto5() { }

    public void Punto5(){
        System.out.println("Ingrese el nombre de sus mascota: ");
        nombreMascota = leer.nextLine();
        System.out.println("Ingrese el tipo de mascota: ");
        tipoMascota = leer.nextLine();
        System.out.println("Ingrese la edad de su mascota: ");
        edadMascota = Integer.parseInt( leer.nextLine());
        System.out.println("Ingrese el nombre del dueño de la mascota: ");
        nombre = leer.nextLine();


        System.out.println(nombreMascota+" es un(a) "+tipoMascota+" , el cual tiene \n "+edadMascota+" años de edad y "+nombre+" es actualmente su dueño(a)");
        System.out.println("------------------------------------------------------------------------------------------------------");
    }
}
