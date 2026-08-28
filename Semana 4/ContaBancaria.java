import java.util.ArrayList;

public class ContaBancaria {
    private String titular;
    private String cpf;
    private String dataNascimento;
    private double saldo;
    private ArrayList<Double> movimentacoes;

    public ContaBancaria(String titular, String cpf, String dataNascimento, double saldoInicial) {
        this.titular = titular;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;

        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }

        this.movimentacoes = new ArrayList<>();

        if (this.saldo > 0) {
            movimentacoes.add(this.saldo);
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Double> getOperacoes() {
        return movimentacoes;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setTitular(String novo) {
        if (novo != null && !novo.trim().isEmpty()) {
            titular = novo;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }

        saldo += valor;
        movimentacoes.add(valor);
        System.out.println("Depósito realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        saldo -= valor;
        movimentacoes.add(-valor);
        System.out.println("Saque realizado com sucesso.");
    }

    public void exibirExtrato() {
        System.out.println("\n--- EXTRATO ---");

        if (movimentacoes.isEmpty()) {
            System.out.println("Nenhuma movimentação.");
            return;
        }

        for (double movimentacao : movimentacoes) {
            if (movimentacao > 0) {
                System.out.printf("Depósito: +R$ %.2f%n", movimentacao);
            } else {
                System.out.printf("Saque: R$ %.2f%n", movimentacao);
            }
        }

        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public double totalDepositado() {
        double total = 0;

        for (double movimentacao : movimentacoes) {
            if (movimentacao > 0) {
                total += movimentacao;
            }
        }

        return total;
    }

    public double maiorSaque() {
        double maior = 0;

        for (double movimentacao : movimentacoes) {
            if (movimentacao < 0) {
                double saque = -movimentacao;

                if (saque > maior) {
                    maior = saque;
                }
            }
        }

        return maior;
    }

    public void aplicarRendimento(double percentual) {
        if (percentual <= 0) {
            System.out.println("Percentual inválido.");
            return;
        }

        double rendimento = saldo * percentual / 100;
        saldo += rendimento;
        movimentacoes.add(rendimento);

        System.out.printf("Rendimento aplicado: R$ %.2f%n", rendimento);
    }
}
