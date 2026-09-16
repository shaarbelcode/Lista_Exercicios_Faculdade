package br.com.shaarbel.lista01;

import java.util.Scanner;

public class Exercicio04 {
    //4. Ler quatro notas bimestrais e exibir a média aritmética do aluno.

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua nota do primeiro bimestre : ");
        double nt_1bim = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a sua nota do segundo bimestre : ");
        double nt_2bim = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a sua nota do terceiro bimestre :");
        double nt_3bim = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite a sua nota do quarto bimestre :");
        double nt_4bim = sc.nextDouble();
        sc.nextLine();
    }
}
