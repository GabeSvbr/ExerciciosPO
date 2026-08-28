import java.util.ArrayList;

public class Banco {
    private ArrayList<ContaBancaria> contas;
    private int proximoNumero;

    public Banco() {
        contas = new ArrayList<>();
        proximoNumero = 1;
    }

    public int criarConta(String titular, String cpf, String dataNascimento, double saldoInicial) {
        ContaBancaria conta = new ContaBancaria(titular, cpf, dataNascimento, saldoInicial);
        contas.add(conta);

        int numero = proximoNumero;
        proximoNumero++;

        return numero;
    }

    private ContaBancaria localizarConta(int numero) {
        if (numero <= 0 || numero > contas.size()) {
            return null;
        }

        return contas.get(numero - 1);
    }

    public void sacar(int numero, double valor) {
        ContaBancaria conta = localizarConta(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return;
        }

        conta.sacar(valor);
    }

    public void depositar(int numero, double valor) {
        ContaBancaria conta = localizarConta(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return;
        }

        conta.depositar(valor);
    }

    public void consultarSaldo(int numero) {
        ContaBancaria conta = localizarConta(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return;
        }

        System.out.printf("Saldo da conta: R$ %.2f%n", conta.getSaldo());
    }

    public void exibirExtrato(int numero) {
        ContaBancaria conta = localizarConta(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return;
        }

        conta.exibirExtrato();
    }

    public void transferir(int origem, int destino, double valor) {
        if (origem == destino) {
            System.out.println("Não é possível transferir para a mesma conta.");
            return;
        }

        ContaBancaria contaOrigem = localizarConta(origem);
        ContaBancaria contaDestino = localizarConta(destino);

        if (contaOrigem == null) {
            System.out.println("Conta de origem não encontrada.");
            return;
        }

        if (contaDestino == null) {
            System.out.println("Conta de destino não encontrada.");
            return;
        }

        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        if (valor > contaOrigem.getSaldo()) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        contaOrigem.sacar(valor);
        contaDestino.depositar(valor);

        System.out.println("Transferência realizada com sucesso.");
    }

    public void aplicarRendimento(int numero, double percentual) {
        ContaBancaria conta = localizarConta(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return;
        }

        conta.aplicarRendimento(percentual);
    }

    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }

        System.out.println("\n--- CONTAS ---");

        for (int i = 0; i < contas.size(); i++) {
            ContaBancaria conta = contas.get(i);

            System.out.println(
                "Conta: " + (i + 1)
                + " | Titular: " + conta.getTitular()
                + " | CPF: " + conta.getCpf()
                + " | Saldo: R$ "
                + String.format("%.2f", conta.getSaldo())
            );
        }
    }
}
