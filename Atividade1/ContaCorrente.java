public class ContaCorrente extends ContaBancaria {
    private static final double TARIFA_SAQUE = 0.50;

    public ContaCorrente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double total = valor + TARIFA_SAQUE;
        if (valor <= 0 || total > saldo) {
            System.out.println("Saque inválido ou saldo insuficiente para tarifa.");
            return;
        }
        saldo -= total;
        movimentacoes.add("Saque: R$ " + valor + " (tarifa: R$ " + TARIFA_SAQUE + ")");
    }
}
