package com.sofka.Taller3;

import java.util.Scanner;

public class Ciclos4 {

    Scanner leer = new Scanner(System.in);
    int numero, total;

    public void tabla(){
        System.out.println("Ingrese un numero: ");
        numero = leer.nextInt();
        for (int i = 1; i <= 10; i++){
            total = i * numero;
            System.out.println(i+" x "+numero+ " = " +total );
        }
    }

}
