package controle;

import modelo.Pedido;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ControleDePedidos {
    private final List<Pedido> pedidos = new ArrayList<>();
    public void registrar(Pedido pedido) { pedidos.add(pedido); }
    public List<Pedido> getPedidos() { return List.copyOf(pedidos); }
    public double faturamento() {
        return pedidos.stream().mapToDouble(Pedido::total).sum();
    }
    public Pedido maisCaro() {
        return pedidos.stream().max(Comparator.comparingDouble(Pedido::total)).orElse(null);
    }
}
