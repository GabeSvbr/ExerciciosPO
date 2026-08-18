import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente("Discord", "99928-1234");
        Paciente paciente2 = new Paciente("Michael Myers", "99923-3235");

        Consulta consulta1 = new Consulta(
                paciente1,
                LocalDate.of(2026, 8, 20),
                150.00
        );

        Consulta consulta2 = new Consulta(
                paciente2,
                LocalDate.of(2026, 8, 21),
                200000.00
        );

        System.out.println("Consulta 1:         ");
        consulta1.exibirComprovante();

        System.out.println("\nConsulta 2:       ");
        consulta2.exibirComprovante();
    }
}
