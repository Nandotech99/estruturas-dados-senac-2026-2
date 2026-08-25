package com.example;

public class TiposDeVetores {

    public void vetorDeInteiros(){
        System.out.println("");
        int [] age=new int[3];
        System.out.println();
        age[0]=15;
        age[1]=20;
        age[2]=42;

        for(int i =0;i<age.length;i++){
            System.out.println("age["+i+"] ="+age[i]);
        }
    }
}
