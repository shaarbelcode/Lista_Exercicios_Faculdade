
import java.util.Scanner;

public class Exercicio06 {



    public static void main(String[] args){
        //6. Ler o raio de um círculo e exibir a área e o perímetro

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o raio do circulo : ");
                double raioCirculo = sc.nextDouble();
                double area = (3.14 * 5/2);
                double perimetro = (2 * 3.14 * raioCirculo );
                sc.nextLine();
                System.out.println("a área do seu circulo é "+ area + " e seu Perimetro é : "+perimetro);








    }
}
