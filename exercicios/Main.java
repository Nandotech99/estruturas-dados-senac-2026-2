import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Hello world!");
        double [] caixa=new double[5];
        double acumula=0;

        for(int i=0;i<caixa.length;i++){
            System.out.println("Insira o valor #"+i);
            caixa[i]=sc.nextDouble();
        }

      for(int i=0;i<caixa.length;i++){
            acumula+=caixa[i];
        }
        double maiorValor=caixa[0];
        double menorValor=caixa[0];

        for(int i =0;i<caixa.length;i++){
            if (caixa[i]>maiorValor){
                maiorValor = caixa[i];
            }else {
              menorValor=caixa[i];
            }
        }
        double media = acumula/ caixa.length;
        System.out.println("Total vendido: R$"+ acumula);
        System.out.println("Media p/ caixa: R$"+ media);
        System.out.println("Caixa maior venda: "+ maiorValor);
        System.out.println("Caixa  menor venda: "+ menorValor);

        for (int i =0;i<caixa.length;i++){
            if (caixa[i]>media){
                System.out.println("Caixa #"+i+" esta acima da media");
            }
        }


    }
}
