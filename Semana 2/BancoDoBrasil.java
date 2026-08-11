public class BancoDoBrasil {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();

        c1.titular = "Carlos";
        c2.titular = "João";

        c1.depositar(500);
        c1.sacar(100);

        c2.depositar(300);
        c2.sacar(400);

        c1.exibirSaldo();
        c2.exibirSaldo();
    }
}

class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        if (valor <= saldo)
            saldo -= valor;
        else
            System.out.println("Saldo insuficiente!");
    }

    void exibirSaldo() {
        System.out.println(titular + ": R$ " + saldo);
    }
}
