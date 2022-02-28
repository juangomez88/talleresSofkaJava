package com.sofka.Taller4;


public class Arreglos3 {
    int contar;


    public void arreglos3(){
        System.out.println("Los numeros primos del 1 al 1000 son: ");
        for(int i =1; i<=1000;i++){
            contar =0;
            for (int j = 1; j<=i;j++){
                if(i%j ==0){
                    contar++;
                }
            }
            if(contar == 2){
                System.out.println(i);
            }
        }
    }
}
