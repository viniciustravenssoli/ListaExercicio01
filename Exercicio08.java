import java.util.Scanner;

public class Exercicio08 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        var number = leitor.nextInt();
        leitor.close();

        String mensagem = (number >= 50) ? "Numero maior ou igual a 50"
                : "Numero menor que 50";
        System.out.println(mensagem);
    }
}
