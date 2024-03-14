import java.util.Scanner;

public class Exercicio09 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o numero A: ");
        var A = leitor.nextInt();

        System.out.println("Informe o numero B: ");
        var B = leitor.nextInt();
        leitor.close();

        if (A == B) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            int maior = Math.max(A, B);
            System.out.println("O maior número é: " + maior);
        }
    }
}
