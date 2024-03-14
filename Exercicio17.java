import java.util.Scanner;

public class Exercicio17 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        double[] notas = new double[3];
        double[] pesos = new double[3];
       
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota : ", i + 1);
            notas[i] = leitor.nextDouble();
            
            System.out.printf("Digite o peso para a nota : ", i + 1);
            pesos[i] = leitor.nextDouble();
        }
        leitor.close();

        double somaProdutos = 0;
        double somaPesos = 0;

        for (int i = 0; i < notas.length; i++) {
            somaProdutos += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        var result = somaProdutos / somaPesos;

        System.out.println(result);

    }
}
