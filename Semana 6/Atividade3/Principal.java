public class Principal {
    public static void main(String[] args) {
        Locadora locadora = new Locadora();

        locadora.adicionarVeiculo(new Carro("ABC1234", "Sedan", 120));
        locadora.adicionarVeiculo(new Carro("DEF5678", "Hatch", 100));
        locadora.adicionarVeiculo(new Moto("GHI9012", "Moto 150cc", 60));
        locadora.adicionarVeiculo(new Moto("JKL3456", "Moto 300cc", 90));

        locadora.alugar("ABC1234", 3);
        locadora.alugar("GHI9012", 7);
        locadora.alugar("XYZ0000", 2);
        locadora.alugar("DEF5678", 0);

        System.out.printf("Faturamento total: R$ %.2f%n", locadora.getFaturamento());
    }
}
