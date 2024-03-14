import java.util.Scanner;

public class Exercicio10 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um numero ");
        var A = leitor.nextInt();

        String numeroPorExtenso;

        switch (A) {
            case 1:
                numeroPorExtenso = "um";
                break;
            case 2:
                numeroPorExtenso = "dois";
                break;
            case 3:
                numeroPorExtenso = "tres";
                break;
            case 4:
                numeroPorExtenso = "quatro";
                break;
            case 5:
                numeroPorExtenso = "cinco";
                break;
            default:
                numeroPorExtenso = "Número inválido!";
                break;
        }

        System.out.println(numeroPorExtenso);
        
    }
}
