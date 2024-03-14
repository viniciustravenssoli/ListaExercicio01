import java.util.Scanner;

public class Exercicio03 {

    public static void Executar() {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Informe o numero A: ");
        var A = leitor.nextInt();

        System.out.println("Informe o numero B: ");
        var B = leitor.nextInt();
        leitor.close();

        if (A > B) {
            System.out.println("O maior número é A: " + A);
        } else if (B > A) {
            System.out.println("O maior número é B: " + B);
        } else {
            System.out.println("A sequência de números informados é inválida, pois são iguais.");
        }
    }
}
