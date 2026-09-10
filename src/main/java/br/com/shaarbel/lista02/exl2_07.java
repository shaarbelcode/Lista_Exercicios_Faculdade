//7. Ler a hora do dia como um inteiro de 0 a 23 e imprimir a
//saudação correspondente: de 0 a 11 bom dia, de 12 a 17 boa
//tarde, de 18 a 23 boa noite. Horas fora dessa faixa são
//inválidas.



package br.com.shaarbel.lista02;

import java.util.Scanner;

public class exl2_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Me informe as horas");
        int hora = sc.nextInt();

        if(hora >= 0 && hora <=11){
            System.out.println("Bom diaaaa !!!");
        }else if(hora >= 12 && hora<=17){
            System.out.println("Boa tarde fiot ");
        }else if(hora >18 && hora <=23){
            System.out.println("Boa noite meu consagrado ");
        }else{
            System.out.println("FORMATO DE HORAS INFORMADO INCORRETO , PORFAVOR INSERIR MODO DE HORARIO CORRETO. ");
        }
    }
}
