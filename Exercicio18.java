import java.util.Scanner;

public class Exercicio18 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        double[] notas = new double[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota : ", i + 1);
            notas[i] = leitor.nextDouble();
        }
        leitor.close();

        var mediaHarmonica = 3 / (1 / notas[0] + 1 / notas[1] + 1 / notas[2]);

        System.out.println(String.format("%.2f", mediaHarmonica));
    }
}
