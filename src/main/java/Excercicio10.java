import java.util.Scanner;

public class Excercicio10 {
    //10. Ler a média final de um aluno e classificá-la: média maior ou igual a 7 resulta em
    //aprovado, média entre 5 e 7 resulta em recuperação, e média abaixo de 5 resulta em
    //reprovado
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua media final");
        double media_final = sc.nextDouble();

        if(media_final >= 7.0 ){
            System.out.println("Pabens paso de ano 👍");
        }else if (media_final == 5.0 && media_final < 7.0){
            System.out.println("Ficou de recuperação");
        }else if (media_final < 5.0){
            System.out.println("Reprovado kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        }

    }
}
