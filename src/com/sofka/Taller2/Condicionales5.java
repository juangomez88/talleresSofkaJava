package com.sofka.Taller2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Condicionales5 {
    Scanner leer = new Scanner(System.in);
    String productos[] = {"Alcohol","Algodon", "Acetaminofem","Vendas","Ibuprofeno","Jeringas" };
    int precios[] = {1500,250,350,270,420,190};
    int inventario[] = {5,5,5,5,5,5};
    DecimalFormat formatoMiles = new DecimalFormat("###,###.##");
    int opcion,seleccionProducto,cantidad, total;



    private void mostrarProductos(){
        for (int i = 0; i<productos.length; i++){
            System.out.println((i+1)+". "+productos[i]+" valor: $"+ formatoMiles.format(precios[i])+" cantidad en inventario: "+inventario[i]);
        }
    }


    private void comprar(){
        System.out.println("Seleccione el producto que desea comprar: ");
        mostrarProductos();
        seleccionProducto = Integer.parseInt(leer.nextLine());
            System.out.println("Seleccione la cantidad a comprar: ");
            cantidad = Integer.parseInt(leer.nextLine());
            total = precios[seleccionProducto-1] * cantidad;
            if(cantidad < 1 ) {
                System.out.println("El producto está agotado");
            }
            if(cantidad > inventario[seleccionProducto]){
                System.out.println("Existen en inventario: "+inventario[seleccionProducto-1]);
                }else {
                inventario[seleccionProducto - 1] = inventario[seleccionProducto - 1] - cantidad;
            }
            System.out.println("Producto comprado: ");
            System.out.println(productos[seleccionProducto-1]+" cantidad: "+ cantidad+" valor: $ "+  formatoMiles.format(total));

    }

    private void devolucion(){
        System.out.println("Seleccione producto a devolver: ");
        mostrarProductos();
        seleccionProducto = Integer.parseInt(leer.nextLine());
        System.out.println("Ingrese la cantidad a devolver: ");
        cantidad = Integer.parseInt(leer.nextLine());
        System.out.println("Devolucion producto: "+productos[seleccionProducto-1]+cantidad);
        inventario[seleccionProducto-1]=inventario[seleccionProducto-1]+1;
        mostrarProductos();
    }

    public void farmacia(){
        do {
            System.out.println("FARAMACIA MI SALUD");
            System.out.println("1. Comprar");
            System.out.println("2. Devoluciones");
            System.out.println("3. Ver Productos");
            System.out.println("4. Salir");

            opcion = Integer.parseInt(leer.nextLine());

            switch (opcion){
                case 1:
                    comprar();
                    break;
                case 2:
                    devolucion();
                    break;
                case 3:
                    mostrarProductos();
                    break;
                case 4:
                    System.out.println("...Saliendo...");
                    break;
            }

        }while (opcion!=4);
    }
}
