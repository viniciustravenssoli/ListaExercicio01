import java.util.Scanner;

public class Exercicio06 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius: ");
        var tempCelsius = leitor.nextInt();
        leitor.close();

        System.out.println("F:" + (9 * tempCelsius + 160) / 5);
    }
}
