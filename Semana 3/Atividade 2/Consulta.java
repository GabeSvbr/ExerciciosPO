import java.time.LocalDate;

public class Consulta {
    Paciente paciente;
    LocalDate data;
    double valor;

    public Consulta(Paciente paciente, LocalDate data, double valor) {
        this.paciente = paciente;
        this.data = data;
        this.valor = valor;
    }
    void exibirComprovante() {
        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Data: " + data);
        System.out.println("Valor: R$ " + valor);
    }
}
