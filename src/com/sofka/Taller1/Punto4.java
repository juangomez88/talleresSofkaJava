package com.sofka.Taller1;
import java.util.Scanner;

public class Punto4 {
    String cuidad;
    String pais;
    Scanner leer = new Scanner(System.in);

    public Punto4() { }

    public void Punto4(){
        System.out.println("Ingrese un país: ");
        pais = leer.nextLine();
        System.out.println("Ingrese la capital del país");
        cuidad = leer.nextLine();

        System.out.println("La ciudad "+ cuidad+ " es la capital del país "+pais);
        System.out.println("------------------------------------------------------------");
    }
}
