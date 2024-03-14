import java.util.Scanner;

public class Exercicio12 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        System.out.println("Digite o número do mês (1 a 12):");
        int numeroMes = leitor.nextInt();

        leitor.close();

        String resposta;
        if (numeroMes >= 1 && numeroMes <= 12) {
            resposta = meses[numeroMes - 1];
        } else {
            resposta = "Mês inválido";
        }
       
        System.out.println(resposta);
    }
}

