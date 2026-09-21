public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    public void aplicarRendimento(double percentual) {
        if (percentual < 0) {
            System.out.println("Percentual inválido.");
            return;
        }
        double rendimento = saldo * percentual / 100.0;
        saldo += rendimento;
        movimentacoes.add("Rendimento: R$ " + rendimento);
    }
}
