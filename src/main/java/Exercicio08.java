import java.util.Scanner;
public class Exercicio08{

    //8. Ler uma temperatura em graus Celsius e convertê-la para Fahrenheit e para Kelvin.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a Temperatura: ");
        double celcius = sc.nextDouble();
        sc.nextLine();

        double fahrenheit = (celcius * 9/5+32);
        double kelvin = (celcius + 273.0);

        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Kelvin : " + kelvin);
    }
}
