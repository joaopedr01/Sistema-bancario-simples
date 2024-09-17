import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "João Pedro da Silva";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        double transferencia = 0;

        String mensagemInicial = """
                ********************************
                Dados iniciais do cliente:
                
                Nome:           %s
                Tipo conta:     %s
                Saldo inicial:  R$ %.2f
                ******************************** %n%n
                """.formatted(nome, tipoConta, saldo);
        String operacoes = """
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - sair
                """;

        System.out.println(mensagemInicial);
        System.out.println("Operações:");

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int i = 0;

        while (i != 4) {
            System.out.println(operacoes);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("R$ %.2f%n", saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a receber: ");
                    transferencia = scanner.nextDouble();
                    saldo += transferencia;
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja transferir: ");
                    transferencia = scanner.nextDouble();
                    saldo -= transferencia;
                    break;
                case 4:
                    System.out.println("Encerrando operação");
                    i = opcao;
                    break;
            }

        }
    }
}