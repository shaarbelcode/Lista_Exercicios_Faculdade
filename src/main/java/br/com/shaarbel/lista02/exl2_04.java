//4. Ler dois números inteiros e informar se o primeiro é múltiplo
//do segundo. Antes de calcular, verificar se o segundo número é
//zero e, nesse caso, informar que a verificação não pode ser
//feita.



package br.com.shaarbel.lista02;

import java.util.Scanner;

public class exl2_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Favor informar o primeiro numero : ");
            numero1 = sc.nextInt();
                sc.nextLine();
        System.out.println("Favor informar o segundo numero : ");
            numero2 = sc.nextInt();

            if(numero2 == 0){
                System.out.println("Não é possivel prosseguir com sua operação, tente novamente.");
            }else if (numero1 % numero2 == 0){
                System.out.println("O numero " + numero1 + " é multiplo de " + numero2 );
            }

    }
}
