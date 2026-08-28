package org.example;

import java.util.Scanner;

public class Exercicio03 {
    //Ler valor em reais e a cotação do dólar e exibir o valor convertido.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor a ser convertido");
        double real = sc.nextDouble();
        System.out.println("Qual a cotação do Dolar? ");
        double cotacao = sc.nextDouble();
        System.out.printf("Valor convertido é %.2f", real/cotacao);

    }

}
