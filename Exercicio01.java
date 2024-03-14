import java.util.Scanner;

public class Exercicio01 {

    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        var number = leitor.nextInt();
        leitor.close();

        String mensagem = (number > 10) ? "Número maior do que 10!" : "Número menor ou igual a 10!";
        System.out.println(mensagem);
    }
}
