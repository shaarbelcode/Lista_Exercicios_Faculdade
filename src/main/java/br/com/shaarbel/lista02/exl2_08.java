//8. Ler a velocidade máxima da via e a velocidade do veículo.
//Classificar a infração conforme o Código de Trânsito Brasileiro:
//dentro do limite não há multa, até 20 por cento acima do limite
//a infração é média, acima de 20 e até 50 por cento é grave,
//acima de 50 por cento é gravíssima



package br.com.shaarbel.lista02;

import java.util.Scanner;

public class exl2_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vMax,vVeiculo,limite;

        System.out.println("Qual a velocidade maxima da via : ");
             vMax = sc.nextInt();
                sc.nextLine();
        System.out.println("Digite a velocidade do veículo : ");
             vVeiculo = sc.nextInt();




    }
}
