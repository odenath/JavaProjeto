package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leia= new Scanner(System.in);
        int vetA[] = new int [10];
        int vetB[] = new int [10];
        int vetC[] = new int [10];
        int par[]  = new int [10];
        int impar[]  = new int [10];
        int soma = 0;
        int escolha = 0;
        int valor = 0;
        int indice = 0;
        int possui = 0;
        int i = 0;





        System.out.println("Digite os números");

        for ( i=0;i< vetA.length;i++){
            vetA[i]=leia.nextInt();
        }
        for( i=0;i<vetA.length;i++){
            System.out.print(vetA[i]+" , ");
        }

        vetB=vetA;


        for ( i=0;i< vetC.length;i++){
            vetC[i]=(vetA[i]*vetB[i]);
            if (vetC[i]%2==0){
                par[i]=vetC[i];
            }
            else{
                impar[i]=vetC[i];
            }
        }
        System.out.println("Pares");
        for ( i=0;i< par.length;i++) {
            System.out.print( par[i]+" . ");
        }
        System.out.println("Impar");
        for ( i=0;i< impar.length;i++) {
            System.out.print(impar[i]+" . ");
        }
        System.out.println("Vetor C");
        for ( i=0;i< vetC.length;i++) {
            System.out.print(vetC[i]+" . ");
        }
        for(i=0;i<par.length;i++){
            soma+=par[i];
        }

        System.out.println("Deseja procurar número? 1 sim 2 não");
        escolha= leia.nextInt();

        switch (escolha){
            case 1:

                System.out.println("Digite o valor que procura no vetor Par");
                valor= leia.nextInt();
                for ( i = 0;i<par.length;i++){

                    if (par[i]==valor){
                        indice=i;
                        possui=valor;
                    }
                }
                if (possui==valor){
                    System.out.println("O número é "+possui+" no indice"+indice);
                } else {
                    System.out.println("N existe");
                }
                break;

            case 2:;
                break;

        }
        System.out.println("A soma é "+soma);







        // write your code here
    }
}
