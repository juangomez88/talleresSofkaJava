package com.sofka.Taller2;

import java.util.Scanner;

public class Condicionales4 {

 String peliculas[] = {"Pulp Fiction", "El padrino", "La vida es Bella", "El club de la pelea", "Cadena Perpetua", "La lista de Schindler", "Forest Gump"};
 String alquiladas[] = {"disponible","disponible","disponible","disponible","disponible","disponible","disponible"};
 String nombre;
 Scanner leer = new Scanner(System.in);
 int posicionPelicula, opcion, entrega;

 
    private void recorrerPeliculas(){

        for(int i = 0; i< peliculas.length;i++){
            System.out.println((i+1)+". "+peliculas[i]+" Estado: "+alquiladas[i]);
            }
    }


    private void ingresarNovedad(){

        System.out.println("Seleccione la pelicula desea entregar: ");
        recorrerPeliculas();
        entrega = Integer.parseInt(leer.nextLine());
        if( alquiladas[entrega-1].equals("alquilada")){
            alquiladas[entrega-1] = "disponible";
        }else
            System.out.println("La pelicula no fue alquilada");
    }

    public void alquilarPelicula(){

        do {

            System.out.println("Seleccione la opcion a realizar: ");
            System.out.println("1. Alquilar pelicula.");
            System.out.println("2. Consultar peliculas disponibles");
            System.out.println("3. Ingresar novedades");
            System.out.println("4. Salir");
            opcion = Integer.parseInt(leer.nextLine());

            if (opcion == 1) {

                    System.out.println("Ingrese el nombre del usuario: ");
                    nombre = leer.nextLine();

                    System.out.println("Selecione la pelicula que desea alquilar: ");

                    recorrerPeliculas();

                    System.out.println("-----------------------------------------------");

                    posicionPelicula = Integer.parseInt(leer.nextLine());

                    System.out.println("Usuario: "+nombre+"\nPelicula alquilada: " + peliculas[posicionPelicula - 1]);
                    alquiladas[posicionPelicula-1] = "alquilada";
            }
            if(opcion ==2 ){
              recorrerPeliculas();
              System.out.println("---------------------------------------------");

            }
            if (opcion == 3){
                ingresarNovedad();
            }
            if(opcion == 4){
                System.out.println("....Saliendo....");
                break;
            }
            if(opcion <1 || opcion >4){
                System.out.println("Opcion incorrecta");
            }
        }while (opcion !=4);
    }
}
