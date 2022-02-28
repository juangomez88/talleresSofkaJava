package com.sofka.Taller4;

import java.util.Random;

public class Arreglos1 {
    int vector[] = {55, 99, 11, 56, 69};
    Random randomico = new Random(100);
    int vector2[] = new int[20];
    int vectorPar[] = new int[20];
    int vectorImpar[] = new int[20];
    int j;
    int k;
    public void arreglos1(){
        for(int i =0; i < vector.length; i++){
            System.out.println("[ "+i+" ] = "+vector[i]);
        }
    }

    public void arreglos2(){
        System.out.println("Vector original: ");
        for (int i =0;i<20;i++){
            vector2[i]=(randomico.nextInt(1,100));
            System.out.print(vector2[i]+" ");
        }
        System.out.println();

        System.out.println("Vector par: ");

        while(j < 20){
            if(vector2[j] % 2 == 0){
                vectorPar[j] = vector2[j];
                System.out.print(vectorPar[j] + " ");
            }
            j++;
        }
        System.out.println();

        System.out.println("Vector impar: ");
        while(k <20){
            if(vector2[k] % 2 == 1){
                vectorImpar[k] = vector2[k];
                System.out.print(vectorImpar[k]+" ");
            }
            k++;
        }
        System.out.println();
    }


}
