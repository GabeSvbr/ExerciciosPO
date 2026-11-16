package relatorio;

public class SaidaConsole implements SaidaRelatorio {
    @Override
    public void escrever(String texto) { System.out.println(texto); }
}
