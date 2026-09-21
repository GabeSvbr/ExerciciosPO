public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = Math.max(0, salario);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            salario += salario * percentual / 100.0;
        }
    }

    public double salarioDoMes() {
        return salario;
    }
}
