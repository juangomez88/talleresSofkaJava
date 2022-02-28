package com.sofka.Taller1;
import javax.swing.*;
import java.util.Scanner;

public class Punto3 {

    String nombre, nombrePadre, nombreMadre;
    String apellido, apellidoPadre, apellidoMadre;

    Scanner leer = new Scanner(System.in);

    public Punto3() { }

    public void Punto3(){

        System.out.println("Ingrese su nombre: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = leer.nextLine();

        System.out.println("Ingrese el nombre de su padre: ");
        nombrePadre = leer.nextLine();
        System.out.println("Ingrese el apellido de su padre: ");
        apellidoPadre = leer.nextLine();

        System.out.println("Ingrese el nombre de su madre: ");
        nombreMadre = leer.nextLine();
        System.out.println("Ingrese el apellido de su madre: ");
        apellidoMadre = leer.nextLine();

        System.out.println("Yo "+ nombre+ " "+apellido+" soy hijo de "+ nombreMadre+" "+apellidoMadre+ " y "+nombrePadre+" "+ apellidoPadre);
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }
}
