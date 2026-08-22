import java.util.Scanner;

public class Exercicio01 {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Qual é a sua  idade?: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.println("Qual é a sua altura");
            double altura = sc.nextDouble();
            sc.nextLine();

            System.out.println("E por ultimo, Informe seu nome: ");
            String nome = sc.nextLine();

            System.out.println("----------------------------------");
            System.out.println("O cidadão se chama " +  nome + " ,ele tem " + idade + " angitos,e tem  " + altura + " metros de altura.");

        }
    }


