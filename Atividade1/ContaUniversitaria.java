public class ContaUniversitaria extends ContaBancaria {
    private static final double LIMITE_SAQUE = 300.00;

    public ContaUniversitaria(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0 || valor > LIMITE_SAQUE || valor > saldo) {
            System.out.println("Saque inválido. Limite por saque: R$ 300,00.");
            return;
        }
        saldo -= valor;
        movimentacoes.add("Saque universitário: R$ " + valor);
    }
}
