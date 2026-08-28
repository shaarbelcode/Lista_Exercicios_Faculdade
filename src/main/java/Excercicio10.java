import java.util.Scanner;

public class Excercicio10 {
    //10. Ler a média final de um aluno e classificá-la: média maior ou igual a 7 resulta em
    //aprovado, média entre 5 e 7 resulta em recuperação, e média abaixo de 5 resulta em
    //reprovado
    static void main(String[] args) {
        double media_aluno , aprovado, recuperacao, reprovado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua media final : ");
        media_aluno = sc.nextDouble();

        aprovado = (media_aluno>=7);
        recuperacao = (media_aluno< 5 && 7 > media_aluno);
        if(media_aluno >= 7 ){
            media_aluno = aprovado;
            System.out.println("Pabens paso de ano !!!");
        }

    }
}
