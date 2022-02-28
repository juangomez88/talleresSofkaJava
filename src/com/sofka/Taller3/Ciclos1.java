package com.sofka.Taller3;

public class Ciclos1 {

    int contador, espacios, contarEspacio;
    String signo, tabular;

    public void p1(){
        for(int i = 1; i <= 10; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public void p2(){
        for(int i=1; i <= 10; i++){
            for (int j = 10; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public void p3(){

        contador = 0;
        signo = "*";
        tabular = " ";
        contarEspacio = 1;
        espacios = 12;

        System.out.println("              *");
        for (int i =1; i<=12;i++){
            while(contador <= i){
                signo = signo + "*";
                contador++;
            }while(contarEspacio <= espacios){
                tabular = tabular + " ";
                contarEspacio = contarEspacio + 1;
            }
            System.out.println(tabular+signo);
            contador--;
            espacios--;
            contarEspacio =1;
            tabular = " ";
        }
        System.out.println("            *****       ");
        System.out.println("             ***        ");
        System.out.println("            *****       ");
        System.out.println("           *******       ");
    }
}
