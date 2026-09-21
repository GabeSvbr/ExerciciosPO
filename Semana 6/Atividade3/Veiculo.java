public class Veiculo {
    private String placa;
    private String modelo;
    private double diaria;

    public Veiculo(String placa, String modelo, double diaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.diaria = Math.max(0, diaria);
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getDiaria() {
        return diaria;
    }

    public double calcularAluguel(int dias) {
        if (dias <= 0) {
            return -1;
        }
        return diaria * dias;
    }
}
