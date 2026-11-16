package modelo;

import excecao.PrecoInvalidoException;

public abstract class Prato {
    private final String nome;
    private final double precoBase;
    private final int tempoPreparo;

    protected Prato(String nome, double precoBase, int tempoPreparo) throws PrecoInvalidoException {
        if (precoBase < 0) throw new PrecoInvalidoException("Preço base negativo: " + nome);
        this.nome = nome;
        this.precoBase = precoBase;
        this.tempoPreparo = tempoPreparo;
    }

    protected double getPrecoBase() { return precoBase; }
    public String getNome() { return nome; }
    public int getTempoPreparo() { return tempoPreparo; }

    public abstract double calcularPreco();
}
