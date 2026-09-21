import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private String titular;
    protected double saldo;
    protected List<String> movimentacoes;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.movimentacoes = new ArrayList<>();
        movimentacoes.add("Abertura: R$ " + saldoInicial);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        saldo += valor;
        movimentacoes.add("Depósito: R$ " + valor);
    }

    public void sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            System.out.println("Saque inválido ou saldo insuficiente.");
            return;
        }
        saldo -= valor;
        movimentacoes.add("Saque: R$ " + valor);
    }

    public void exibirExtrato() {
        System.out.println("\nTitular: " + titular);
        for (String movimentacao : movimentacoes) {
            System.out.println(movimentacao);
        }
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
