import java.util.Scanner;

public class Exercicio09 {

    //9. Ler um número inteiro e informar se ele é par ou ímpar.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, par = 0, impar = 1;
        System.out.println("Digite o numero e direi se é par ou impar: ");
            numero = sc.nextInt();
                if(numero %2 == 0){
                    numero = par;
                    System.out.println("O Seu numero é par !!");
                } else if (numero %2 == 1) {
                    numero = impar;
                    System.out.println("Seu numero é impar");
                }


    }
}
