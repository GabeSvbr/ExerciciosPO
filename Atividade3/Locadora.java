import java.util.ArrayList;

public class Locadora {
    private ArrayList<Veiculo> frota = new ArrayList<>();
    private double faturamento;

    public void adicionarVeiculo(Veiculo veiculo) {
        if (veiculo != null) {
            frota.add(veiculo);
        }
    }

    public boolean alugar(String placa, int dias) {
        if (dias <= 0) {
            System.out.println("Quantidade de dias deve ser maior que zero.");
            return false;
        }

        for (Veiculo veiculo : frota) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                double valor = veiculo.calcularAluguel(dias);
                if (valor < 0) {
                    return false;
                }
                faturamento += valor;
                System.out.printf("Aluguel de %s (%s), %d dia(s): R$ %.2f%n",
                        veiculo.getModelo(), veiculo.getPlaca(), dias, valor);
                return true;
            }
        }

        System.out.println("Placa inexistente: " + placa);
        return false;
    }

    public double getFaturamento() {
        return faturamento;
    }
}
