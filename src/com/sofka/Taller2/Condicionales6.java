package com.sofka.Taller2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Condicionales6 {

    DecimalFormat formatoMiles = new DecimalFormat("###,###.##");
    Scanner leer = new Scanner(System.in);
    int opcion, opcion2, puestoEntrega;
    int contar = 0;
    String placa;
    int sumaServicios[] = {12000, 30000, 51000, 21000};
    String modelo, nombrePropietario;
    String modeloMoto[]  = new String[5];
    String placaVehiculos [] = new String[5];
    String propietarios[] = new String[5];


    private void servicios(){
        System.out.println("Seleccione los servicios realizados: ");

        System.out.println("1. Ajuste cadena--------------> $12.000");
        System.out.println("2. Cambio de aceite-----------> $30.000");
        System.out.println("3. Mantenimiento general------> $51.000");
        System.out.println("4. Cambio de luces------------> $21.000");

    }

    private void recorrerMotos(){
        for(int i =0; i<placaVehiculos.length;i++){
            if(placaVehiculos[i] != null)
            System.out.println( (i+1)+". "+" Propietario: "+propietarios[i]+" ****Placa: "+placaVehiculos[i]+" ****Modelo y marca: "+modeloMoto[i]);
        }
    }

    private void ingresoMoto(){

        System.out.println("Ingrese el nombre del propietario del vehiculo: ");
        nombrePropietario = leer.nextLine();

        System.out.println("Ingrese la placa del vehiculo: ");
        placa = leer.nextLine();

        System.out.println("Ingrese el modelo y marca del vehiculo: ");
        modelo = leer.nextLine();

        contar++;
        if(contar == 5 ){
            System.out.println("El taller no tiene cupo");
        }
        placaVehiculos[contar-1] = placa;
        propietarios[contar-1] = nombrePropietario;
        modeloMoto[contar-1] = modelo;

    }

    private void entregaMoto(){
        System.out.println("Seleccione el puesto del vehiculo: ");
        recorrerMotos();
        puestoEntrega = Integer.parseInt(leer.nextLine());
        System.out.println("Seleccione los servicios realizados al vehiculo: ");
        servicios();
        opcion2 = Integer.parseInt(leer.nextLine());
        System.out.println("Propietario: "+propietarios[puestoEntrega-1]);
        System.out.println("Vechiculo: "+modeloMoto[puestoEntrega-1]+" Placa: "+placaVehiculos[puestoEntrega-1]);
        System.out.println("Valor a pagar: $ "+ formatoMiles.format(sumaServicios[opcion2-1]));
    }

    public void tallerMotos(){

        do {
            System.out.println("Taller El Maquinista");
            System.out.println("Seleccione el tipo de servicio: ");
            System.out.println("1. Ingreso al taller");
            System.out.println("2. Entregar motocicleta");
            System.out.println("3. Ver motos");
            System.out.println("4. Salir");

            opcion = Integer.parseInt(leer.nextLine());

            switch (opcion){
                case 1:
                    ingresoMoto();
                    break;
                case 2:
                    entregaMoto();
                    break;
                case 3:
                    recorrerMotos();
                    break;
                case 4:
                    System.out.println("...Saliendo...");
                    break;
            }
        }while(opcion !=4);
    }
}
