import java.util.Scanner;

public class Excercicio07{

    //7. Ler a base e a altura de um retângulo e exibir a área, o perímetro e a diagonal.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do Retângulo :");
        double baseRetangulo = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a altura do Retângulo :");
        double alturaRetangulo = sc.nextDouble();
        sc.nextLine();

        double area = (baseRetangulo * alturaRetangulo);
        double perimetro = (2*(baseRetangulo+alturaRetangulo));
        double diagonal = Math.sqrt(Math.pow(baseRetangulo,2)+Math.pow(alturaRetangulo,2));

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Diagonal: " + diagonal);
    }
}