//Asumo que el banco inicialmente tiene 4 clientes
//Clientes: Maria Sanchez, Juan gomez, Bruno Diaz, Ricardo Tapias
//Montos en la cuenta de cada cliente:
//Maria Sanchez : $500.000, Juan Gomez: $ 250.000, Bruno Díaz: $ 750.000, Ricardo Tapias: 310.000
//Identificacion usuarios:
//001: Maria SAnchez
//002: Juan Gomez
//003: Bruno Diaz
//004: Ricardo Tapias

package com.sofka.Taller2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Condicionales10 {

    DecimalFormat formatoMiles = new DecimalFormat("###,###.##");
    String clientes[] = {"Maria Sanchez", "Juan gomez", "Bruno Diaz", "Ricardo Tapias"};
    int opcion, deposito,retiro, idUsuario, nuevoSaldo;
    int saldoUsuarios[] = {500000, 250000, 750000, 310000};
    Scanner leer = new Scanner(System.in);

    private void consignar(){
        System.out.println("Ingrese su numero de identificacion de usuario: ");
        idUsuario = Integer.parseInt(leer.nextLine());

        if( idUsuario  > clientes.length ){

            System.out.println("Usuario no registrado");

        }else {
            System.out.println("Usuario: " + clientes[idUsuario - 1]);
            System.out.println("Ingrese el valor a consignar: ");
            deposito = Integer.parseInt(leer.nextLine());
            if(deposito >0){
                nuevoSaldo = deposito + saldoUsuarios[idUsuario - 1];
                System.out.println("Nuevo saldo: $ "+ formatoMiles.format(nuevoSaldo));
            }else
                System.out.println("El valor no puede ser negativo");
        }
    }

    private void retirar(){
        System.out.println("Ingresar su numero de identificaicon de usuario: ");
        idUsuario = Integer.parseInt(leer.nextLine());
        if( idUsuario  > clientes.length ){

            System.out.println("Usuario no registrado");

        }else {
            System.out.println("Usuario: " + clientes[idUsuario - 1]);
            System.out.println("Ingrese el valor a retirar: ");
            retiro = Integer.parseInt(leer.nextLine());
            if(retiro < saldoUsuarios[idUsuario-1]){
                nuevoSaldo = saldoUsuarios[idUsuario - 1] - retiro;
                System.out.println("Nuevo saldo: $ "+ formatoMiles.format(nuevoSaldo));
            }else
                System.out.println("No puede retirar un valor mayor a su saldo");
        }

    }

    public void p10(){

        do {
            System.out.println("SU BANCO FIEL");
            System.out.println("Elija una opción: ");
            System.out.println("1. Retirar");
            System.out.println("2. Consignar");
            System.out.println("3. Salir");

            opcion = Integer.parseInt(leer.nextLine());

            switch (opcion){
                case 1:
                    retirar();
                    break;
                case 2:
                    consignar();
                    break;
                case 3:
                    System.out.println("...Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        }while (opcion !=3);
    }
}
