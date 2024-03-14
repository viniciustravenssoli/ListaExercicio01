import java.util.Scanner;

public class Exercicio13 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        double A;
        double B;
        String operacao;
        double result = 0;

        System.out.println("Digite um numero");
        A = leitor.nextDouble();

        System.out.println("Digite outro numero");
        B = leitor.nextDouble();
        
        System.out.println("Digite a operação: *, /, + ou -");
        operacao = leitor.next();

        switch (operacao) {
            case "/":
            if (B != 0) {
                result = A / B;
            } else {
                System.out.println("Não é possível dividir por zero.");
                return;
            }
                break;
            case "*":
                result = A * B;
                break;
            case "+":
                result = A + B;
                break;
            case "-":
                result = A - B;
                break;

            default:
                System.out.println("Operador invalido");
                break;
        }

        System.out.println(result);
    }
}
