//5. Ler um ano e informar se ele é bissexto. Um ano é bissexto
//quando é divisível por 4 e não é divisível por 100, ou quando é
//divisível por 400.



package br.com.shaarbel.lista02;

import java.util.Scanner;

public class exl2_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;

        System.out.println("Me fala um ano ai e direi se é bissexto : ");
            ano = sc.nextInt();

            if (ano % 4 == 0 && ano % 100 !=0 ){
                System.out.println("Esse ano é bissexto. ");
            }else if (ano % 400 == 0){
                System.out.println("Esse ano é bissexto. ");
            }else {
                System.out.println("Esse ano não é bissexto");
            }

    }
}
