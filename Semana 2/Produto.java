public class Produto {
    String nome;
    double preco;
    int estoque;

    void exibirInfo() {
        System.out.println(nome + " - R$ " + preco);
    }

    void vender(int qtd) {
        estoque -= qtd;
    }
}
