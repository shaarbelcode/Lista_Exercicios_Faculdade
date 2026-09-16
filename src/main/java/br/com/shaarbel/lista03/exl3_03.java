//3. Ler uma nota até que o valor informado esteja entre 0 e
//10. Enquanto estiver fora da faixa, imprimir mensagem de
//valor inválido e ler novamente. Ao final, imprimir a nota
//aceita.



package br.com.shaarbel.lista03;

import java.util.Scanner;

public class exl3_03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        System.out.println("Digite sua nota : ");
        nota = sc.nextInt();
        if (nota > 10) {
            System.out.println("Numero invalido, digite novamente");
        } else {

            do {
                System.out.println(nota);
                nota++;
            } while (nota >= 0 && nota <= 10);
            System.out.println("Nota aceita");
        }
    }
}