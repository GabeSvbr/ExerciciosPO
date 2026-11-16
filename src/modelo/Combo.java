package modelo;

import excecao.PrecoInvalidoException;

public class Combo extends Prato {
    public Combo(String nome, double preco, int tempo) throws PrecoInvalidoException {
        super(nome, preco, tempo);
    }

    @Override
    public double calcularPreco() { return getPrecoBase() * 0.85; }
}
