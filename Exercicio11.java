import java.util.Arrays;
import java.util.Scanner;

public class Exercicio11 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        int[] entrada = new int[3];

        for(int i = 0; i < entrada.length; i++)
        {
            System.out.println("Digite o valor do " + (i + 1) + " numero");
            entrada[i] = leitor.nextInt();
        }

        boolean aux;
        do {
            aux = false;
            for (int i = 0; i < entrada.length - 1; i++) {
                if (entrada[i] > entrada[i + 1]) {
                    int temp = entrada[i];
                    entrada[i] = entrada[i + 1];
                    entrada[i + 1] = temp;
                    aux = true;
                }
            }
        } while (aux);
        

        //Arrays.sort(entrada);

        for (int valor : entrada) {
            System.out.println(valor);
        }
    }
}
