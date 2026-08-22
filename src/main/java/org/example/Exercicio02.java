package org.example;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        //Ler dois números inteiros e exibir a soma, a subtração , o produto, a divisão inteira e o resto da divisão.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int numero1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite outro numero inteiro");
        int numero2 = sc.nextInt();
        sc.nextLine();

        System.out.println("O Resultado da  soma é " + (numero1+numero2));
        System.out.println("O Resultado da subtração é " + (numero1-numero2));
        System.out.println("O Resultado da  multiplicação é " + (numero1*numero2));
        System.out.println("O Resultado da Divisão  é " + (numero1/numero2));
        System.out.println("E o resto da divisão é " + (numero1%numero2));


    }
}

