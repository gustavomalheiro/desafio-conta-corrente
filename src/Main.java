import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int opcaoSelecionada = 0;
        double valorDeposito = 0.0;
        double valorTransferencia = 0.0;

        String nomeCliente = "Gustavo Malheiro";
        String tipoConta = "Corrente";
        double saldoInicial = 250.40;

        System.out.println("*************************************");
        System.out.println("Dados iniciais do cliente\n");
        System.out.printf("Nome:            %s \n", nomeCliente);
        System.out.printf("Tipo de conta:   %s \n", tipoConta);
        System.out.printf("Saldo inicial:   R$ %.2f \n", saldoInicial);
        System.out.println("*************************************\n");

        while (opcaoSelecionada != 4) {
            System.out.println("\nOperações\n");

            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Depositar valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair\n");

            System.out.println("Digite a opção desejada: ");
            opcaoSelecionada = leitura.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                    System.out.printf("O saldo atual é R$ %.2f\n", saldoInicial);
                    break;
                case 2:
                    System.out.println("Informe o valor a ser depositado: ");
                    valorDeposito = leitura.nextDouble();
                    saldoInicial += valorDeposito;
                    System.out.printf("Saldo atualizado R$ %.2f \n", saldoInicial);
                    break;
                case 3:
                    System.out.println("Informe o valor a ser transferido: ");
                    valorTransferencia = leitura.nextDouble();
                    if (valorTransferencia > saldoInicial) {
                        System.out.println("Você não tem saldo o suficiente para essa transação!");
                    } else {
                        saldoInicial -= valorTransferencia;
                        System.out.printf("Saldo atualizado R$ %.2f \n", saldoInicial);
                    }
                    break;
                case 4:
                    System.out.println("\nObrigado por utilizar nossos serviços digitais!");
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }
        }
    }
}