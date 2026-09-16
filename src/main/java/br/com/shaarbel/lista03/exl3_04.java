//4. Exibir um menu com as opções 1 para dobro, 2 para
//metade, 3 para quadrado e 0 para sair. Ler a opção e,
//quando ela for de 1 a 3, ler um número e aplicar a operação
//escolhida com switch. Opções fora da faixa caem no default
//como inválidas. O menu se repete até que a opção lida seja
//0.



package br.com.shaarbel.lista03;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class exl3_04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0, numero = 0, escoperacao1, escoperacao2;
        double operação;

            System.out.println("Escolha uma das opções do menu : ");
            System.out.println("===================================");
            System.out.println("Opção (1) : dobro");
            System.out.println("Opção (2) : metade");
            System.out.println("Opção (3) : quadrado");
            System.out.println("Opção (0) : Sair");
            System.out.println("===================================");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Opção escolhida : Dobro ");
                    while(menu == 1){
                        System.out.println(numero);
                        numero++;
                        break;
            }
        }
    }
}
