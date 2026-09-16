//2. Ler um número inteiro e imprimir a tabuada dele de 1 a
//10, uma linha por multiplicação, no formato 7 x 1 = 7. A
//repetição deve ser feita com while



package br.com.shaarbel.lista03;

import java.util.Scanner;

public class exl3_02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1, ntabuada;

        System.out.println("Me diga o numero de qual tabuada você quer : ");
            ntabuada = sc.nextInt();

        while(numero <= 10){
            System.out.println(ntabuada + " X " + numero + " = " + (ntabuada*numero));
            numero++;
        }
    }
}
