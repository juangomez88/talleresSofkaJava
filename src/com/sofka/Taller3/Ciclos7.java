package com.sofka.Taller3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ciclos7 {
    List placasVehiculos = new ArrayList<>(4);
    List marcaVehiculos = new ArrayList<>(4);
    List nombreCompleto = new ArrayList();
    List telefeno = new ArrayList();
    Scanner leer = new Scanner(System.in);
    String placa, marca, nombre, numeroTelefono, buscarVechiculo;
    int opcion, posicion, contar;

    private void ingresarVeciculo(){
        System.out.println("Ingrese la placa del vehiculo: ");
        placa = leer.nextLine();
        placasVehiculos.add(placa);

        System.out.println("Ingrese la marca del vehiculo: ");
        marca = leer.nextLine();
        marcaVehiculos.add(marca);

        System.out.println("Ingrese el nombre completo del propietario: ");
        nombre = leer.nextLine();
        nombreCompleto.add(nombre);

        System.out.println("Ingrese el numero telefonico del propietario: ");
        numeroTelefono = leer.nextLine();
        telefeno.add(numeroTelefono);
    }

    private void buscarVechiculo(){
        System.out.println("Ingrese el vechiculo a buscar: ");
        buscarVechiculo = leer.nextLine();
        posicion = placasVehiculos.indexOf(buscarVechiculo);
        if(posicion >= 0){
            System.out.println("El Vehiculo: "+ buscarVechiculo +" de la marca: "+marcaVehiculos.get(posicion) +" se encuentra en el parqueadero");
            System.out.println("Nombre de propietario: "+nombreCompleto.get(posicion)+"\nOrganización: "+telefeno.get(posicion));
            System.out.println("********************************");
        }else{
            System.out.println("El elemento "+ buscarVechiculo+ " no está en la lista");
        }
    }

    private void retirarVechiculo(){
        System.out.println("Ingrese el vechiculo a retirar: ");
        buscarVechiculo = leer.nextLine();
        posicion = placasVehiculos.indexOf(buscarVechiculo);
        if(posicion >= 0){
            placasVehiculos.remove(posicion);
            marcaVehiculos.remove(posicion);
            nombreCompleto.remove(posicion);
            telefeno.remove(posicion);
        }else{
            System.out.println("El vehiculo "+ buscarVechiculo+ " no está en el parqueadero");
        }
    }

    public void parqueadero(){

        do {
            System.out.println("Capacidad de vehiculos en el parquedero: "+(5-contar));
            System.out.println("Elija la opción a realizar:  ");
            System.out.println("1. Ingresar Vehiculo");
            System.out.println("2. Retirar vehiculo");
            System.out.println("3. Consultar vehiculo");
            System.out.println("4. salir");
            opcion = Integer.parseInt(leer.nextLine());

            switch (opcion){
                case 1:
                    contar++;
                    if(contar<6){
                        ingresarVeciculo();
                    }else
                        System.out.println("El parquedero está lleno");
                    break;
                case 2:
                    contar--;
                    if(contar <0){
                        System.out.println("El parqueadero no tiene vehiculos para retirar");
                    }else
                        retirarVechiculo();
                    break;
                case 3:
                    buscarVechiculo();
                    break;
                case 4:
                    System.out.println("...Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta, por favor verifique su selección");

            }
        }while(opcion!=4);

    }
}
