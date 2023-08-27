import java.util.Random;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número de 1 até 100?");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número é menor do que o digitado");
            } else {
                System.out.println("O número é maior do que o digitado");
            }
        }

        if (tentativas == 5) {
            System.out.println("Você não conseguiu acertar o número");
        }


    }
}
