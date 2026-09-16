//9. Ler o salário de um funcionário e o tempo de casa em anos.
//Definir o bônus: menos de 1 ano não recebe, de 1 a 3 anos
//recebe 5 por cento, acima de 3 e até 10 anos recebe 10 por
//cento, acima de 10 anos recebe 15 por cento. Imprimir o
//percentual e o valor do bônus



package br.com.shaarbel.lista02;

import java.util.Scanner;

public class exl2_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anos, percentualsalario;
        double salario,calculoanos;

        System.out.println("Me informe seu salario : ");
             salario = sc.nextDouble();
        System.out.println("Agora me informe seu tempo de empresa: ");
             anos = sc.nextInt();

        if(anos > 1 && anos <=3){
            percentualsalario = 5;
            calculoanos = ((salario * percentualsalario) / 100);
            System.out.printf("Você contém direito a 5% de bônus,Seu salário ficou no valor de :  R$ : "+ calculoanos);
        }else if(anos > 3 && anos <= 10){
            percentualsalario = 10;
            calculoanos = ((salario * percentualsalario) / 100);
            System.out.println("Você contém direito a 10% de bonus, Seu salário ficou de  : R$ : "+ calculoanos);
        }else if (anos >10){
            percentualsalario = 15;
            calculoanos = ((salario * percentualsalario) / 100);
            System.out.println("Você tem direito a 15% de bonus, Seu salário ficou de : R$ : " + calculoanos);
        }else
            System.out.println("Você não recebe bonus , aguarde 1 ano para ser contemplado");
    }
}
