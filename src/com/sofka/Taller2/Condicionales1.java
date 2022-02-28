package com.sofka.Taller2;

import java.util.Scanner;

public class Condicionales1 {
    int edad;
    String nombre, apellido;

    Scanner leer = new Scanner(System.in);

    public Condicionales1() { }

    public void Condicionales1(){
        System.out.println("Ingrese su edad: ");
        edad = leer.nextInt();

        if (edad >= 18){
            System.out.println("Usted es mayor de edad.");
        }
    }

    public void Condicionales2(){
        System.out.println("Ingrese su edad: ");
        edad = leer.nextInt();
        if (edad < 18){
            System.out.println("Usted es aún un niño(a).");
        }
    }

    public void Condicionales3(){
        System.out.println("Ingrese su nombre: ");
        nombre = leer.nextLine();

        System.out.println("Ingrese su apellido: ");
        apellido = leer.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(leer.nextLine());

        if(edad < 18){
            System.out.println(nombre+" "+apellido+" usted es menor de edad, por lo tanto,\n no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }else {
            System.out.println(nombre+" "+ apellido+ " usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
        }

        System.out.println("-----------------------------------------------------------------------------------------------------------------");

    }
}
