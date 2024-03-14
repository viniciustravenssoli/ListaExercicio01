import java.util.Scanner;

public class Exercicio20 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Informe o tempo em horas");
        double tempoViagem = leitor.nextDouble();
        System.out.println("Informe a Velocidade media");
        double velocidadeMedia = leitor.nextDouble();
        leitor.close();

        double distancia  = velocidadeMedia * tempoViagem;
        var litros = distancia / 12; 

        System.out.println(litros+ " litros");
    }
}
