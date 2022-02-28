package com.sofka.Taller2;

import java.util.Scanner;

public class Condicionales9 {
    Double baseTriangulo, alturaTriangulo, ladoA, ladoB, baseMayor, baseMenor, alturaTrapecio;
    Double areaTriangulo, areaCuadrado, areaTrapecio;
    Scanner leer = new Scanner(System.in);
    int opciones;

    private void calculoTringulo(){

        System.out.println("Ingrese la base del triangulo: ");
        baseTriangulo = Double.parseDouble(leer.nextLine());

        System.out.println("Ingrese la altura del triangulo: ");
        alturaTriangulo = Double.parseDouble(leer.nextLine());

        areaTriangulo = (baseTriangulo*alturaTriangulo)/2;
        System.out.println("El area del triangulo es: "+areaTriangulo);
    }

    private void calculoCuadro(){
        System.out.println("Ingrese el lado A del rectangulo: ");
        ladoA = Double.parseDouble(leer.nextLine());

        System.out.println("Ingrese el lado B del rectangulo: ");
        ladoB = Double.parseDouble(leer.nextLine());

        areaCuadrado = ladoA * ladoB;
        System.out.println("El area de recttangulo es: "+ areaCuadrado);
    }

    private void caluloTrapecio(){
        System.out.println("Ingrese la base mayor del trapecio: ");
        baseMayor = Double.parseDouble(leer.nextLine());

        System.out.println("Ingrese la base menor del trapecio: ");
        baseMenor = Double.parseDouble(leer.nextLine());

        System.out.println("Ingrese la altura del trapecio: ");
        alturaTrapecio = Double.parseDouble(leer.nextLine());
        areaTrapecio = ((baseMayor+baseMenor)*alturaTrapecio)/2;
        System.out.println("El area del trapecio es: "+areaTrapecio);
    }

    public void figuras(){
        do {
            System.out.println("Seleccione la figura que le desea calcula su area: ");
            System.out.println("1. Area tringulo");
            System.out.println("2. Area cuadrado");
            System.out.println("3. Area trapecio");
            System.out.println("4. Salir");

            opciones = Integer.parseInt(leer.nextLine());

            switch (opciones){
                case 1:
                    calculoTringulo();
                break;
                case 2:
                    calculoCuadro();
                    break;
                case 3:
                    caluloTrapecio();
                    break;
                case 4:
                    System.out.println("...Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        }while (opciones != 4);
    }
}
