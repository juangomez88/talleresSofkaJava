package com.sofka.Taller2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Condicionales7 {
    private Double peso,estatura, total;
    private String nombre;
    Scanner leer = new Scanner(System.in);
    String estado[] = {"Bajo de peso", "Peso normal", "Sobrepeso", "Obeso"};
    DecimalFormat formatoMiles = new DecimalFormat("###,###.##");

    private void datos(){
        System.out.println("Ingrese su nombre: ");
        nombre = leer.nextLine();

        System.out.println("Ingrese su peso en Kilogramos: ");
        peso = Double.parseDouble(leer.nextLine());

        System.out.println("Ingrese su estatura: ");
        estatura = Double.parseDouble(leer.nextLine());
    }

    private void calculo(){
        total = peso / Math.pow(estatura,2);
        if(total <= 18.5){
            System.out.println(nombre+" su IMC es: "+formatoMiles.format(total)+" y su estado es: "+estado[0]);
        }
        if(total > 18.5 && total <= 24.9){
            System.out.println(nombre+" su IMC es: "+formatoMiles.format(total)+" y su estado es: "+estado[1]);
        }
        if (total >=25.0 && total <=29.0){
            System.out.println(nombre+" su IMC es: "+formatoMiles.format(total)+ " y su estado es: "+estado[2]);
        }
        if (total >= 30.0){
            System.out.println(nombre+" su IMC es: "+formatoMiles.format(total)+ " y su estado es: "+estado[3]);
        }
    }

    public  void IMC (){
        datos();
        calculo();

    }
}
