import java.util.Scanner;

public class Exercicio07 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        var number = leitor.nextInt();
        leitor.close();

        String mensagem = (number >= 100 && number <= 200) ? "Numero esta entre 100 e 200" : "Numero nao esta entre 100 e 200";
        System.out.println(mensagem);
    }

}
