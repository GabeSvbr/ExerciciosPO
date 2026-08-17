public class Principal {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Pepino", "pepino@email.com");
        Cliente cliente2 = new Cliente("João", "joao@email.com");

        Produto produto1 = new Produto("Mouse", 700.00);
        Produto produto2 = new Produto("Teclado", 500.00);

        Pedido pedido1 = new Pedido(cliente1, produto1, 2);
        Pedido pedido2 = new Pedido(cliente2, produto2, 1);

        System.out.println("Pedido 1:   ");
        pedido1.resumo();

        System.out.println("\nPedido 2:   ");
        pedido2.resumo();
    }
}
