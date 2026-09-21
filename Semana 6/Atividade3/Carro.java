public class Carro extends Veiculo {
    private static final double SEGURO = 30.00;

    public Carro(String placa, String modelo, double diaria) {
        super(placa, modelo, diaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        double valor = super.calcularAluguel(dias);
        if (valor < 0) {
            return -1;
        }
        return valor + SEGURO;
    }
}
