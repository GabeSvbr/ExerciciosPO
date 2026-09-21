public class Estagiario extends Funcionario {
    private int horasSemana;

    public Estagiario(String nome, double salarioBase40h, int horasSemana) {
        super(nome, salarioBase40h);
        this.horasSemana = Math.max(0, Math.min(40, horasSemana));
    }

    @Override
    public double salarioDoMes() {
        return getSalario() * horasSemana / 40.0;
    }
}
