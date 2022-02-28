package com.sofka;

import com.sofka.Taller1.*;
import com.sofka.Taller2.*;
import com.sofka.Taller3.*;
import com.sofka.Taller4.Arreglos1;
import com.sofka.Taller4.Arreglos3;
import com.sofka.Taller4.Arreglos4;
import com.sofka.Taller4.Arreglos5;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
// Taller #1
        Punto1 p1 = new Punto1();
        Punto2 p2 = new Punto2();
        Punto3 p3 = new Punto3();
        Punto4 p4 = new Punto4();
        Punto5 p5 = new Punto5();
//  Taller #2
        Condicionales1 c1 = new Condicionales1();
        Condicionales4 c4 = new Condicionales4();
        Condicionales5 c5 = new Condicionales5();
        Condicionales6 c6 = new Condicionales6();
        Condicionales7 c7 = new Condicionales7();
        Condicionales8 c8 = new Condicionales8();
        Condicionales9 c9 = new Condicionales9();
        Condicionales10 c10 = new Condicionales10();

//        Taller # 3
        Ciclos1 ciclo1 = new Ciclos1();
        Ciclos4 ciclos4 = new Ciclos4();
        Ciclos5 ciclo5 = new Ciclos5();
        Ciclos6 ciclo6 = new Ciclos6();
        Ciclos7 ciclos7 = new Ciclos7();
        Ciclos8 ciclos8 = new Ciclos8();

//        Taller # 4
        Arreglos1 arr1 = new Arreglos1();
        Arreglos3 arr3 = new Arreglos3();
        Arreglos4 arr4 = new Arreglos4();
        Arreglos5 arr5 = new Arreglos5();

        int opcion, opcion2, opcion3, opcion4, opcion5;


        do {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.printf("Seleccione el taller que desea ver: \n");
            System.out.println("1. Taller variables e impresión");
            System.out.println("2. Taller condicionales");
            System.out.println("3. Taller de ciclos");
            System.out.println("4. Taller de arreglos");
            System.out.println("5. Salir");
            System.out.println("----------------------------------------------------------------------------------");

            opcion = Integer.parseInt(leer.nextLine());

            switch (opcion){
                case 1:

                    System.out.println("Seleccionó el taller # 1: ");
                    do {
                        System.out.println("Seleccione el punto del taller: ");
                        System.out.println("1. Punto (1)");
                        System.out.println("2. Punto (2)");
                        System.out.println("3. Punto (3)");
                        System.out.println("4. Punto (4)");
                        System.out.println("5. Punto (5)");
                        System.out.println("6...Volver...");

                        opcion2 = Integer.parseInt(leer.nextLine());

                        switch (opcion2){
                            case 1:
                                p1.Punto1();
                                break;
                            case 2:
                                p2.Punto2();
                                break;
                            case 3:
                                p3.Punto3();
                                break;
                            case 4:
                                p4.Punto4();
                                break;
                            case 5:
                                p5.Punto5();
                                break;
                            case 6:
                                System.out.println("...Volviendo al menu anterior...");
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                        }
                    }while(opcion2!=6);
                    break;

                case 2:
                    do {
                        System.out.println("Seleccionó el taller # 2: ");
                        for (int i = 1; i< 11; i++ ){
                            System.out.println( i+".) Punto");
                        }
                        System.out.println("11.) volver");
                        opcion3 = Integer.parseInt(leer.nextLine());

                        switch (opcion3){
                            case 1:
                                c1.Condicionales1();
                                break;
                            case 2:
                                c1.Condicionales2();
                                break;
                            case 3:
                                c1.Condicionales3();
                                break;
                            case 4:
                                c4.alquilarPelicula();
                                break;
                            case 5:
                                c5.farmacia();
                                break;
                            case 6:
                                c6.tallerMotos();
                                break;
                            case 7:
                                c7.IMC();
                                break;
                            case 8:
                                c8.p8();
                                break;
                            case 9:
                                c9.figuras();
                                break;
                            case 10:
                                c10.p10();
                                break;
                            case 11:
                                System.out.println("...volver...");
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                        }
                    }while(opcion3 !=11);

                    break;
                case 3:
                    do {
                        System.out.println("Seleccionó el taller # 3: ");
                        for (int i = 1; i< 9; i++ ){
                            System.out.println(i+".) Punto " +i);
                        }
                        System.out.println("9.) Volver");
                        opcion4 = Integer.parseInt(leer.nextLine());

                        switch (opcion4){
                            case 1:
                                ciclo1.p1();
                                break;
                            case 2:
                                ciclo1.p2();
                                break;
                            case 3:
                                ciclo1.p3();
                                break;
                            case 4:
                                ciclos4.tabla();
                                break;
                            case 5:
                                ciclo5.menu();
                                break;
                            case 6:
                                ciclo6.aplicacion();
                                break;
                            case 7:
                                ciclos7.parqueadero();
                                break;
                            case 8:
                                ciclos8.escuela();
                                break;
                            case 9:
                                System.out.println("...volver...");
                                break;
                        }
                    }while(opcion4 != 9);

                    break;
                case 4:
                    do {
                        System.out.println("Seleccionó el taller # 4");
                        System.out.println("Elija el punto que desea ver: ");

                        for (int i = 1; i< 6; i++ ){
                            System.out.println(i+". Punto ("+i+")");
                        }
                        System.out.println("6. volver");
                        opcion5 = Integer.parseInt(leer.nextLine());
                        switch (opcion5){
                            case 1:
                                arr1.arreglos1();
                                break;
                            case 2:
                                arr1.arreglos2();
                                break;
                            case 3:
                                arr3.arreglos3();
                                break;
                            case 4:
                                arr4.p4();
                                break;
                            case 5:
                                arr5.p5();
                                break;
                            case 6:
                                System.out.println("...volver...");
                                break;
                            default:
                                System.out.println("Opcion incorrecta, favor verifique");
                        }
                    }while(opcion5 !=6);
                    break;
                case 5:
                    System.out.println("....Saliendo...");
                    break;
            }

        }while (opcion != 5);
    }
}
