public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        p1.nome = "Mouse";
        p1.preco = 50;
        p1.estoque = 10;

        p2.nome = "Teclado";
        p2.preco = 100;
        p2.estoque = 5;

        p3.nome = "Monitor";
        p3.preco = 10000000000;
        p3.estoque = 3;

        p1.vender(2);

        p1.exibirInfo();
        p2.exibirInfo();
        p3.exibirInfo();
    }
}
