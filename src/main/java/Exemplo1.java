import java.util.Scanner;

public class Exemplo1 {
    static void main(String[] args) {
// Ler 5 notas e contar quantos alunos foram aprovados com nota maior ou igual a 6

        Scanner sc = new Scanner(System.in);
            double[] notas = new double [5];

                for(int i = 0; i < notas.length;i++){
                    System.out.println("Informe sua nota " + (i+1));
                    notas[i] = sc.nextDouble();

                    }
                    int contador = 0;
                    for(double nota : notas){
                        if (nota >=6){
                            contador++;
                        }
                }
        System.out.println("A quantidade de alunos com a nota maior que 6 foi de " + contador);
    }

}
