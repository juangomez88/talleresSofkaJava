package com.sofka.Taller4;

import java.util.Scanner;

public class Arreglos5 {
    int matriz [][] = new int[10][10];
    int opcion, numero1, numero2, resultado;
    Scanner leer = new Scanner(System.in);

    public void multiplicar(){
        System.out.println("Ingrese numero 1: ");
        numero1 = Integer.parseInt(leer.nextLine());

        System.out.println("Ingrese el numero 2: ");
        numero2 = Integer.parseInt(leer.nextLine());

        resultado = matriz[numero1][numero2];
        System.out.println(resultado);
    }

    private void llenarMatriz(){
        for(int i = 1; i<=10;i++ ){
            for (int j = 1; j<= 10; j++){
                matriz[i-1][j-1] = i*j;
                System.out.print(i + " * "+j+" = "+matriz[i-1][j-1]+" ");
            }
            System.out.println();


        }
        System.out.println("Ingrese numero 1: ");
        numero1 = Integer.parseInt(leer.nextLine());

        System.out.println("Ingrese el numero 2: ");
        numero2 = Integer.parseInt(leer.nextLine());

        resultado = matriz[numero1-1][numero2-1];
        System.out.println(resultado);
    }


    public void p5(){
        do {
            System.out.println("Elija una opcion: ");
            System.out.println("1. Elegir dos numeros del 1 al 10");
            System.out.println("2. Salir");

            opcion = Integer.parseInt(leer.nextLine());

            switch (opcion){
                case 1:
                    llenarMatriz();
                    break;
                case 2:
                    System.out.println("...Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while (opcion !=2);

    }
}
