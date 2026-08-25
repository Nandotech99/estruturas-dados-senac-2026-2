package com.example;


public class MediaNotas {
 private double nota1,nota2,nota3;
 
   
    public MediaNotas(double nota1, double nota2, double nota3) {
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
}


    public double  calcularMedia(double n1,double n2,double n3){
    
        double soma = getNota1()+getNota2()+getNota3();
        double media=soma/3;

        return media;

    }


    public double getNota1() {
        return nota1;
    }


    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }


    public double getNota2() {
        return nota2;
    }


    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }


    public double getNota3() {
        return nota3;
    }


    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

}
