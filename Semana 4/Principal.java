import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n==============================");
            System.out.println("       CONTA BANCARIA");
            System.out.println("==============================");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Consultar saldo");
            System.out.println("6 - Ver extrato");
            System.out.println("7 - Aplicar rendimento");
            System.out.println("8 - Listar contas");
            System.out.println("0 - Sair");
            System.out.println("==============================");

            try {
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("\n--- CRIAR CONTA ---");

                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();

                        System.out.print("CPF: ");
                        String cpf = scanner.nextLine();

                        System.out.print("Data de nascimento: ");
                        String data = scanner.nextLine();

                        System.out.print("Saldo inicial: R$ ");
                        double saldoInicial = scanner.nextDouble();
                        scanner.nextLine();

                        int numero = banco.criarConta(nome, cpf, data, saldoInicial);

                        System.out.println("Conta criada com sucesso!");
                        System.out.println("Número da conta: " + numero);
                        break;

                    case 2:
                        System.out.println("\n--- SACAR ---");

                        System.out.print("Número da conta: ");
                        int contaSaque = scanner.nextInt();

                        System.out.print("Valor: R$ ");
                        double valorSaque = scanner.nextDouble();
                        scanner.nextLine();

                        banco.sacar(contaSaque, valorSaque);
                        break;

                    case 3:
                        System.out.println("\n--- DEPOSITAR ---");

                        System.out.print("Número da conta: ");
                        int contaDeposito = scanner.nextInt();

                        System.out.print("Valor: R$ ");
                        double valorDeposito = scanner.nextDouble();
                        scanner.nextLine();

                        banco.depositar(contaDeposito, valorDeposito);
                        break;

                    case 4:
                        System.out.println("\n--- TRANSFERÊNCIA ---");

                        System.out.print("Conta de origem: ");
                        int origem = scanner.nextInt();

                        System.out.print("Conta de destino: ");
                        int destino = scanner.nextInt();

                        System.out.print("Valor: R$ ");
                        double valorTransferencia = scanner.nextDouble();
                        scanner.nextLine();

                        banco.transferir(origem, destino, valorTransferencia);
                        break;

                    case 5:
                        System.out.println("\n--- CONSULTAR SALDO ---");

                        System.out.print("Número da conta: ");
                        int contaSaldo = scanner.nextInt();
                        scanner.nextLine();

                        banco.consultarSaldo(contaSaldo);
                        break;

                    case 6:
                        System.out.println("\n--- EXTRATO ---");

                        System.out.print("Número da conta: ");
                        int contaExtrato = scanner.nextInt();
                        scanner.nextLine();

                        banco.exibirExtrato(contaExtrato);
                        break;

                    case 7:
                        System.out.println("\n--- RENDIMENTO ---");

                        System.out.print("Número da conta: ");
                        int contaRendimento = scanner.nextInt();

                        System.out.print("Percentual: ");
                        double percentual = scanner.nextDouble();
                        scanner.nextLine();

                        banco.aplicarRendimento(contaRendimento, percentual);
                        break;

                    case 8:
                        banco.listarContas();
                        break;

                    case 0:
                        System.out.println("Programa encerrado.");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
