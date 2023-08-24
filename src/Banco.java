import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nome = "César Machado";
        String tipoDaConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        System.out.println("***************************************");
        System.out.println("Nome:             " + nome);
        System.out.println("tipo da conta:    " + tipoDaConta);
        System.out.println("Saldo:            " + saldo);
        System.out.println("***************************************");

        String menu = """ 
                
                *** Digite a sua opção***
                1 - Consultar o Saldo
                2 - Fazer uma Transferência
                3 - Receber uma Transferência
                4 - Finalizar Operação                
                """;

        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            System.out.println("Digite a opção desejada?");
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo é de " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual é o valor da transferência?");
                double valorTransferecia = leitura.nextDouble();
                if (valorTransferecia > saldo) {
                    System.out.println("Saldo Insuficiente");
                } else {
                    saldo -= valorTransferecia;
                    System.out.println("O saldo agora é de:  " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Qual é o valor da transferência?");
                double recebendoValor = leitura.nextDouble();
                saldo += recebendoValor;
                System.out.println("O saldo agora é de:  " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção Invalida");
            } else {
                System.out.println("Obrigado por acessar o app do banco");
                break;
            }
        }
    }
}
