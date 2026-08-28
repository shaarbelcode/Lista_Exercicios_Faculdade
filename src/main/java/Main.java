package org.example;

import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
            System.out.println("Informe o ano em que você nasceu: ");
                int anoNascimento = sc.nextInt();
                     sc.nextLine();

        System.out.println("E qual seu nome ?");
            String nome = sc.nextLine();

        System.out.println("Quantas horas você trabalhou esse mês?");
            double horas = sc.nextDouble();

        System.out.println("Qual o valor da sua hora");
            double valor = sc.nextDouble();

                 double salario = horas * valor;

        System.out.println("-----------------FORMULÁRIO----------------");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: " + (2026 - anoNascimento));
        System.out.printf("Salário do mês: %.2f \n", salario);
        System.out.println("--------------------------------------------");

    }
}
