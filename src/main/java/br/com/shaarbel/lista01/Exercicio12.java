package br.com.shaarbel.lista01;
//12. Ler o consumo mensal de energia em kWh e calcular o valor da conta. Até 100
    //kWh o preço é 0,50 por kWh. De 101 a 300 kWh o preço é 0,75 por kWh. Acima de 300
    //kWh o preço é 1,10 por kWh. A faixa escolhida é aplicada sobre o con
    import java.util.Scanner;

    public class Exercicio12{

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe o seu consumo mensal de energia : ");
            double calculoConsumo;
            double consumo = sc.nextDouble();

            if(consumo >= 100){
                calculoConsumo = (consumo *  0.50 )* 30 / 1000;
                System.out.println("Seu consumo mensal de energia foi de : " + calculoConsumo + "R$");

            } else if (consumo == 101 && consumo < 300){
                calculoConsumo = (consumo *  0.75 )* 30 / 1000;
                System.out.println("Seu consumo mensal de energia foi de : " + calculoConsumo + "R$");

            } else if (consumo > 300){
                calculoConsumo = (consumo * 1.10 )* 30 / 1000;
                System.out.println("Seu consumo mensal de energia foi de : " + calculoConsumo + "R$");
            }

    }
}
