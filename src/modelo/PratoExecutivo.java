package modelo;

import excecao.PrecoInvalidoException;

public class PratoExecutivo extends Prato {
    public PratoExecutivo(String nome, double preco, int tempo) throws PrecoInvalidoException {
        super(nome, preco, tempo);
    }

    @Override
    public double calcularPreco() { return getPrecoBase(); }
}
