import java.util.Scanner;

public class Exercicio19 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);
        
        double pi = 3.14;

        System.out.println("Infome o raio");
        double raio = leitor.nextDouble();
        System.out.println("Infome a altura");
        double altura = leitor.nextDouble();
        leitor.close();

        double volume = pi * raio * raio * altura;

        System.out.println(volume);

    }
}
