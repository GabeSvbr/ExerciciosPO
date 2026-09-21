public class Moto extends Veiculo {
    public Moto(String placa, String modelo, double diaria) {
        super(placa, modelo, diaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        double valor = super.calcularAluguel(dias);
        if (valor < 0) {
            return -1;
        }
        if (dias >= 7) {
            valor *= 0.90;
        }
        return valor;
    }
}
