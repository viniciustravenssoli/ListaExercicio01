import java.util.Scanner;

public class Exercicio05 {

    public static void Executar() {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Informe o numero A: ");
        var A = leitor.nextInt();

        System.out.println("Informe o numero B: ");
        var B = leitor.nextInt();
        leitor.close();

        System.out.println("Valor original");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        var aux = A;
        A = B;
        B = aux;
        System.out.println("Valor alterado");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}
