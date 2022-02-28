package com.sofka.Taller1;
import java.util.Scanner;

public class Punto2 {
    String nombre;
    String apellido;
    int edad;
    Scanner leer = new Scanner(System.in);
    public Punto2() { }

    public void Punto2(){
//       nombre = JOptionPane.showInputDialog("Digite su nombre: ");
//       apellido = JOptionPane.showInputDialog("Digite su apellido: ");

        System.out.println("Ingrese su nombre: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = leer.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = leer.nextInt();

    }
}
