package relatorio;

import controle.ControleDePedidos;
import modelo.Pedido;

public class GeradorRelatorio {
    private final SaidaRelatorio saida;

    public GeradorRelatorio(SaidaRelatorio saida) { this.saida = saida; }

    public void gerar(ControleDePedidos controle) {
        StringBuilder sb = new StringBuilder("=== FECHAMENTO DO DIA ===\n");
        for (Pedido p : controle.getPedidos()) sb.append(p).append("\n");
        sb.append(String.format("Faturamento total: R$ %.2f%n", controle.faturamento()));
        sb.append("Pedido mais caro: ").append(controle.maisCaro());
        saida.escrever(sb.toString());
    }
}
