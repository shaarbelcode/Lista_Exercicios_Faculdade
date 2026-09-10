//6. Ler o valor de uma compra. Compras de 199,00 ou mais têm
//frete grátis; abaixo disso o frete é 24,90. Imprimir o valor do
//frete e o total a pagar nos dois casos



package br.com.shaarbel.lista02;

import java.util.Scanner;

public class exl2_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da compra : ");
            double vlCompra = sc.nextDouble();

        if(vlCompra >= 199.00){
            System.out.println("=============================");
            System.out.println("Preço da compra : " + vlCompra);
            System.out.println("Frete : 0,00R$");
            System.out.println("=============================");
        }else if(vlCompra<199.00){
            System.out.println("==============================");
            System.out.println("Preço da compra : " + vlCompra);
            System.out.println("Frete : " + " R$ "+ vlCompra+24.90);
            System.out.println("==============================");
        }
    }
}
