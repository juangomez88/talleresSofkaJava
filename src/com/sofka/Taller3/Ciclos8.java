package com.sofka.Taller3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ciclos8 {

    List nombreAlumno = new ArrayList<>();
    List notaAlumno = new ArrayList();
    String nombre, buscarAlumno;
    Scanner leer = new Scanner(System.in);
    int opcion, posicion, nota;


    private void registraAlumno(){
        System.out.println("Ingrese el nombre del alumno: ");
        nombre = leer.nextLine();
        nombreAlumno.add(nombre);

        System.out.println("Ingrese la nota: ");
        System.out.println("1. Aprobado \n2. Reprobado");
        nota = Integer.parseInt(leer.nextLine());
        switch (nota){
            case 1:
                notaAlumno.add("Aprobado");
                break;
            case 2:
                notaAlumno.add("Reprobado");
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }

    private void buscarAlumno(){
        System.out.println("Ingrese el alumno a buscar: ");
        buscarAlumno = leer.nextLine();
        posicion = nombreAlumno.indexOf(buscarAlumno);
        if(posicion >= 0){
            System.out.println("El alumno: "+ buscarAlumno + "se encuentra matriculado");
            System.out.println("Nota del alumno: "+notaAlumno.get(posicion));
            System.out.println("********************************");
        }else{
            System.out.println("El alumno "+ buscarAlumno+ " no está en la lista");
        }
    }

    public void escuela(){
        System.out.println("Escuela automovilistica el Maestro");
        System.out.println("**********************************");

        do {

            System.out.println("1. Registrar alumno");
            System.out.println("2. Consultar alumno");
            System.out.println("3. Salir");

            opcion = Integer.parseInt(leer.nextLine());

            switch (opcion){
                case 1:
                    registraAlumno();
                    break;
                case 2:
                    buscarAlumno();
                    break;
                case 3:
                    System.out.println("...saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        }while (opcion !=3);
    }
}
