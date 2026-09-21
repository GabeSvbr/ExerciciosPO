import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria corrente = new ContaCorrente("Ana", 500);
        ContaBancaria poupanca = new ContaPoupanca("Bruno", 500);
        ContaBancaria universitaria = new ContaUniversitaria("Carlos", 500);

        corrente.sacar(50);
        poupanca.sacar(50);
        universitaria.sacar(50);

        ((ContaPoupanca) poupanca).aplicarRendimento(5);

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(corrente);
        contas.add(poupanca);
        contas.add(universitaria);

        System.out.println("Saques polimórficos:");
        for (ContaBancaria conta : contas) {
            conta.sacar(50);
            conta.exibirExtrato();
        }
    }
}
