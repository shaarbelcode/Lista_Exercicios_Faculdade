//1. Ler a idade de uma pessoa e imprimir todas as classificações
//        que se aplicam a ela: 16 anos ou mais pode votar, 18 anos ou
//        mais pode dirigir, 60 anos ou mais é idoso. Uma pessoa de 65
//        anos deve receber as três mensagens.
package br.com.shaarbel.lista02;

import java.util.Scanner;

public class exl2_01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Me fala sua idade : ");
            int idade = sc.nextInt();

            String  mensagem1 = ("Você já pode votar !!");
            String  mensagem2 = ("Você já pode dirigir !");
            String  mensagem3 = ("Você já é velho ");
            String  mensagem4 = ("Você ainda é muito jovem para ter direito de algo , espere alguns aninhos ......");
            if(idade >= 16 ){
                System.out.println(mensagem1);
            }
            if(idade >= 18){
                System.out.println(mensagem2);
            }
            if(idade > 60){
                System.out.println(mensagem3);
            }
            if(idade >= 65){
            }
            if(idade < 16){
                System.out.println(mensagem4);
        }
    }
}
