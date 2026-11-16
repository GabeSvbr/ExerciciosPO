package modelo;

import excecao.PrecoInvalidoException;

public class PratoEspecial extends Prato {
    private final double ingredientePremium;

    public PratoEspecial(String nome, double preco, int tempo, double ingredientePremium) throws PrecoInvalidoException {
        super(nome, preco, tempo);
        this.ingredientePremium = ingredientePremium;
    }

    @Override
    public double calcularPreco() { return getPrecoBase() + ingredientePremium; }
}
