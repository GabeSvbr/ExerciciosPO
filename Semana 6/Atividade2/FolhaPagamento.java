import java.util.ArrayList;

public class FolhaPagamento {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void contratar(Funcionario funcionario) {
        if (funcionario != null) {
            funcionarios.add(funcionario);
        }
    }

    public double fecharFolha() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.salarioDoMes();
            System.out.printf("%s: R$ %.2f%n", funcionario.getNome(), salario);
            total += salario;
        }
        System.out.printf("Total da folha: R$ %.2f%n", total);
        return total;
    }

    public void aumentoGeral(double percentual) {
        if (percentual <= 0) {
            return;
        }
        for (Funcionario funcionario : funcionarios) {
            funcionario.aumentarSalario(percentual);
        }
    }
}
