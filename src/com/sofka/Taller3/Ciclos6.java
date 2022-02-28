package com.sofka.Taller3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ciclos6 {

    Scanner leer = new Scanner(System.in);
    List nombres = new ArrayList();
    List telefonos = new ArrayList();
    List organizacion = new ArrayList();
    String buscarUsuario;
    int posicion, opcion;

    private void almacenarUsuario(){
        System.out.println("Ingrese el nombre del usuairo: ");
        nombres.add(leer.nextLine());

        System.out.println("Ingrese el numero de telefono del usuario: ");
        telefonos.add(leer.nextLine());

        System.out.println("Ingrese la organización: ");
        organizacion.add(leer.nextLine());
    }

    private void buscandoUsario(){
        System.out.println("Ingrese el usuario a buscar: ");
        buscarUsuario = leer.nextLine();
        posicion = nombres.indexOf(buscarUsuario);
        if(posicion >= 0){
            System.out.println("El usuario: "+ buscarUsuario +" se encuentra registrado");
            System.out.println("Número telefonico: "+telefonos.get(posicion)+"\nOrganización: "+organizacion.get(posicion));
            System.out.println("********************************");
        }else{
            System.out.println("El elemento "+ buscarUsuario+ " no está en la lista");
        }
    }

    private void eliminandoUsuario(){
        System.out.println("Ingrese el usuario a eliminar: ");
        buscarUsuario = leer.nextLine();
        posicion = nombres.indexOf(buscarUsuario);
        if(posicion >=0){
            nombres.remove(posicion);
            telefonos.remove(posicion);
            organizacion.remove(posicion);
            System.out.println("...Usuario eliminado...");
        }else{
            System.out.println("El elemento "+ buscarUsuario+ " no está en la lista");
        }
    }


    public void aplicacion(){

        do {
            System.out.println("Seleccione una opcion: ");
            System.out.println("1. Almacenar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir");

            opcion = Integer.parseInt(leer.nextLine());

            switch (opcion){
                case 1:
                    almacenarUsuario();
                    break;
                case 2:
                    buscandoUsario();
                    break;
                case 3:
                    eliminandoUsuario();
                    break;
                case 4:
                    System.out.println("...saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta, favor verificar");

            }

        }while(opcion !=4);



    }
}
