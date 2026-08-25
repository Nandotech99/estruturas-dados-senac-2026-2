package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

// aula 25/08
AnaliseComplexidade analiseComplexidade= new AnaliseComplexidade();
analiseComplexidade.tempoConstante(new int[]{1,2,3,4});

analiseComplexidade.tempoLinear(AnaliseComplexidade.getN());
analiseComplexidade.tempoLogaritmo(AnaliseComplexidade.getN());
analiseComplexidade.tempoQuadratico(AnaliseComplexidade.getN());



}


public static void calculateSum(int a, int b, String userName) {
    System.out.println(a + b + " " + userName);
}



}
