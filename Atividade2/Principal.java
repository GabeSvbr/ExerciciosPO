public class Principal {
    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();

        folha.contratar(new Funcionario("Mariana", 3000));
        folha.contratar(new Gerente("Roberto", 6000, 1500));
        folha.contratar(new Estagiario("Lucas", 1600, 20));

        System.out.println("Folha antes do aumento:");
        folha.fecharFolha();

        folha.aumentoGeral(10);

        System.out.println("\nFolha após aumento de 10%:");
        folha.fecharFolha();
    }
}
