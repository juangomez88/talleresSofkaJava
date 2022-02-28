package com.sofka.Taller1;
import javax.swing.*;
import java.util.Scanner;

public class Punto1 {
    String nombre;
    String apellido;
    Scanner leer = new Scanner(System.in);
    public Punto1() {
    }

    public void Punto1(){

        System.out.println("Ingrese su nombre: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = leer.nextLine();
    }

}
