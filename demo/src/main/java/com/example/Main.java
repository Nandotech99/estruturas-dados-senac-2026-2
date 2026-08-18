package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

        System.out.println("Hello world!");

        calculateSum(5, 10, "Danilo");
        calculateSum(2, 15, "Fernando");

    System.out.println("Insira nota 1");
    double n1=sc.nextDouble();
    System.out.println("Insira nota 2");
    double n2=sc.nextDouble();
    System.out.println("Insira nota 3");
    double n3=sc.nextDouble();
    MediaNotas mediaNotas=new MediaNotas(n1,n2,n3);


System.out.println("Media: "+mediaNotas.calcularMedia(n1, n2, n3));
}


public static void calculateSum(int a, int b, String userName) {
    System.out.println(a + b + " " + userName);
}


}
