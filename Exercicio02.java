import java.util.Scanner;

public class Exercicio02 {

     public static void Executar() {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Informe o numero um: ");
        var number1 = leitor.nextInt();

        System.out.println("Informe o segundo numero: ");
        var number2 = leitor.nextInt();
        leitor.close();

        System.out.println(number1 + number2);
    }
}
