package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final Cliente cliente;
    private final LocalDate data;
    private final List<Prato> pratos = new ArrayList<>();

    public Pedido(Cliente cliente, LocalDate data) {
        if (cliente == null) throw new IllegalArgumentException("Pedido sem cliente não pode existir.");
        this.cliente = cliente;
        this.data = data;
    }

    public void adicionar(Prato prato) { pratos.add(prato); }

    public double total() {
        return pratos.stream().mapToDouble(Prato::calcularPreco).sum();
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %d prato(s) | R$ %.2f", data, cliente.nome(), pratos.size(), total());
    }
}
