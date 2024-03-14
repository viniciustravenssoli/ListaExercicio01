import java.util.Scanner;

public class Exercicio16 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        double[] notas = new double[3];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a" + (i + 1) + " do aluno");
            notas[i] = leitor.nextDouble();
        }
        leitor.close();

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        System.out.println(String.format("%.1f", soma / notas.length));

    }
}
