public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = Math.max(0, bonus);
    }

    @Override
    public double salarioDoMes() {
        return getSalario() + bonus;
    }
}
