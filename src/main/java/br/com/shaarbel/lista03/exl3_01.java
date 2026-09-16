//1. Ler um número inteiro N e imprimir todos os valores de 1
//até N, um por linha. Se N for menor que 1, imprimir que não
//há valores a exibir e encerrar sem entrar no laço.



package br.com.shaarbel.lista03;

import java.util.Scanner;

public class exl3_01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1, quantidade;

        System.out.println("Digite um numero : ");
            quantidade = sc.nextInt();

            while(numero < quantidade){
                System.out.println(numero);
                numero++;
            }
    }
}
