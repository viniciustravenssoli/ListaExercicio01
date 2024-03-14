import java.util.Scanner;

public class Exercicio15 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);
        
        int x1 = 0;
        int x2 = 10;
        int y1 = 5;
        int y2 = 20;

        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        double distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

        System.out.println(String.format( "%.3f", distancia));
    }
}
