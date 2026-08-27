import java.util.Scanner;

public class Exercicio11 {

//11. Ler três números inteiros distintos e exibir o maior deles.
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
            int numero1, numero2, numero3, maior, menor;

    System.out.println("Digite o primero numero :");
        numero1 = sc.nextInt();
            maior = numero1;
            menor = numero1;

    System.out.println("Digite o segundo numero :");
        numero2 = sc.nextInt();
        if(numero2>maior){
            maior = numero2;
        }else if (numero2 < menor){
            menor = numero2;
        }

    System.out.println("Digite o terceiro numero: ");
        numero3 = sc.nextInt();
        if(numero3>maior){
            maior = numero3;
        } else if (numero3 < menor) {
            numero3 = menor;

        }
    System.out.println("O Maior numero é :" + maior +  ", e o menor é :" + menor+".");

    }

}
