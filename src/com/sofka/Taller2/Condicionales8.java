package com.sofka.Taller2;

//          Tomo como supuesto que Don Carlos siempre arranca inventario con 5 unidades de cada torta que vende, y 2 tortas de cada tipo de separadas para vender en porciones
//          Tortas que vende Don Carlos:
//          Torta de chocolate p1: $ 1.400 ---->$175/porcion
//          Torta de fresa p2: $ 1.000 ----> $ 125 /porcion
//          Torta de tres leches p3: $ 1.200 ---> $ 300 / Porción
//          Valor decoracion = $ 250
//          Porciones: Torta de chocolate: 8, Torta de fresa: 8, torta de tres leches: 4


import java.text.DecimalFormat;
import java.util.Scanner;

public class Condicionales8 {

    DecimalFormat formatoMiles = new DecimalFormat("###,###.##");
    Scanner leer = new Scanner(System.in);
    String tipoTorta[] = {"Tota de chocolate", "Torta de fresa", "Torta de de tres leches"};
    int valorTortas[] = {1400, 1000, 1200};
    int valorPorciones[] = {175, 300, 250};
    int cantidadTortas[] = {5, 5, 5};
    int cantidadPorciones[]= {16, 16, 8};
    int opcion, cantidad, completo, seleccionTorta;


    private void verTortas(){
        for(int i =0; i<=2;i++){
            System.out.println(tipoTorta[i]+" Valor: $"+formatoMiles.format(valorTortas[i])+" Cantidad: "+cantidadTortas[i]+" Cantidad de porciones: "+cantidadPorciones[i]);
        }
    }

    private void comprar(){
        System.out.println("Seleccione la opcion de compra: ");
        System.out.println("1. Producto completo");
        System.out.println("2. Prodcuto en porciones");

        completo = Integer.parseInt(leer.nextLine());

        if(completo == 1){
            System.out.println("Seleccione la torta que desea comprar: ");
            System.out.println("1. Torta Chocolate");
            System.out.println("2. Torta de fresa");
            System.out.println("3. Tres leches");

            seleccionTorta = Integer.parseInt(leer.nextLine());

            System.out.println("Cantidad de tortas a comprar: ");
            cantidad = Integer.parseInt(leer.nextLine());

            if(cantidad < cantidadTortas[seleccionTorta-1]){
                System.out.println("Valor de la compra: $"+formatoMiles.format(valorTortas[seleccionTorta-1]*cantidad)+" Torta comprada: "+tipoTorta[seleccionTorta-1]);
                cantidadTortas[seleccionTorta-1]= cantidadTortas[seleccionTorta-1]-cantidad;
            }else
                System.out.println("La cantidad de tortas en inventario es inferior a la cantidad que desea comprar.");
        }

        if(completo == 2){
            System.out.println("Seleccione la porcion de la torta que desea comprar: ");
            System.out.println("1. Torta Chocolate");
            System.out.println("2. Torta de fresa");
            System.out.println("3. Tres leches");

            seleccionTorta = Integer.parseInt(leer.nextLine());

            System.out.println("Cantidad de tortas a comprar: ");
            cantidad = Integer.parseInt(leer.nextLine());

            if(cantidad < cantidadTortas[seleccionTorta-1]){
                System.out.println("Valor de la compra: $"+formatoMiles.format(valorTortas[seleccionTorta-1]*cantidad)+" Torta comprada: "+tipoTorta[seleccionTorta-1]);
                cantidadPorciones[seleccionTorta-1]= cantidadPorciones[seleccionTorta-1]-cantidad;
            }else
                System.out.println("La cantidad de tortas en inventario es inferior a la cantidad que desea comprar.");
        }
    }

    public void p8(){
        do {
            System.out.println("1. Ingresar pedido");
            System.out.println("2. Ver tortas disponibles");
            System.out.println("3. Salir");

            opcion = Integer.parseInt(leer.nextLine());

            switch (opcion){
                case 1:
                    comprar();
                    break;
                case 2:
                    verTortas();
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
