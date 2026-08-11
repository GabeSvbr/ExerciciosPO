public class Filme {
    String titulo;
    int duracao;
    double nota;
    boolean assistido;

    void exibirFicha() {
        System.out.println(titulo + " | " + duracao + " min | Nota: " + nota + " | Assistido: " + assistido);
    }

    void marcarAssistido() {
        assistido = true;
    }

    void avaliar(double novaNota) {
        nota = novaNota;
    }

    public static void main(String[] args) {
        Filme f1 = new Filme();
        Filme f2 = new Filme();
        Filme f3 = new Filme();

        f1.titulo = "Interestelar";
        f1.duracao = 169;
        f1.nota = 9.0;

        f2.titulo = "Batman";
        f2.duracao = 176;
        f2.nota = 8.5;

        f3.titulo = "Shrek";
        f3.duracao = 90;
        f3.nota = 8.0;

        f1.marcarAssistido();
        f2.avaliar(9.5);

        f1.exibirFicha();
        f2.exibirFicha();
        f3.exibirFicha();
    }
}
