//3. Ler a temperatura em graus Celsius e a umidade relativa do
//ar em porcentagem. Imprimir os alertas que se aplicam:
//temperatura de 38 graus ou mais gera alerta de calor extremo,
//umidade abaixo de 30 por cento gera alerta de umidade baixa,
//temperatura de 35 graus ou mais com umidade abaixo de 20
//por cento gera alerta de risco de queimada


package br.com.shaarbel.lista02;

import java.util.Scanner;

public class exl2_03 {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        double temperatura, umidade;

        System.out.println("Digite sua temperatura ");
            temperatura = sc.nextDouble();
                sc.nextLine();
        System.out.println("E me informe a umidade relativa do ar");
            umidade = sc.nextDouble();

        if(temperatura >=38 ){
            System.out.println("ALERTA!!!! CALOR EXTREMO !!!");
        }if (umidade < 30){
            System.out.println("ALERTA DE UMIDADE BAIXA !!!!!");
        }if (temperatura >=35){
            System.out.println("CUIDADO RISCO DE QUEIMADA!!!!!!");
        }if (umidade <20){
            System.out.println("CUIDADE RISCO DE QUEIMADA!!!!!");
        }if (temperatura <30){
            System.out.println("ESTÁ TRANQUILO A TEMPERATURA ESTÁ AMENUA, SUAVE PARA PRATICAR SUAS ATIVIDADES");
        }
    }
}
