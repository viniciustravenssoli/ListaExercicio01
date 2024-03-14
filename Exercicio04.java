import java.util.Scanner;

public class Exercicio04 {

    public static void Executar() {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Informe o numero A: ");
        var A = leitor.nextInt();

        System.out.println("Informe o numero B: ");
        var B = leitor.nextInt();
        leitor.close();

        System.err.println("Divisao:" + (A / B));
        System.err.println("Multiplicação:" + (A * B));
        System.out.println("Subtraçao:" + (A - B));
        System.out.println("Adiçao:" + (A + B));
    }
}
