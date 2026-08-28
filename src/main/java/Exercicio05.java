import java.util.Scanner;

public class Exercicio05 {
    //5. Ler o valor da hora trabalhada e a quantidade de horas do mês. Calcular o salário
    //bruto, o desconto de 8 por cento de INSS e o salário líquido.

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas horas trabalhou? ");
        double horas_trabalho = sc.nextDouble();
        sc.nextLine();

        System.out.println("Informe o valor da hora trabalhada: ");
        double valor_trabalho = sc.nextDouble();
        sc.nextLine();

        double salarioBruto = (horas_trabalho*valor_trabalho);
        double inss = (salarioBruto %8);
        double salarioLiquido = (salarioBruto-inss);

        System.out.println("=======================================");
        System.out.println("Informe do RH:");
        System.out.println("Seu salário bruto é :" + salarioBruto);
        System.out.println("Seu valor do INSS é :" + inss);
        System.out.println("Seu salário liquido é :" + salarioLiquido);
        System.out.println("=======================================");




    }
}
