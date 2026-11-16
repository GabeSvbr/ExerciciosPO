package app;

import controle.ControleDePedidos;
import excecao.PrecoInvalidoException;
import modelo.*;
import relatorio.*;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) throws PrecoInvalidoException {
        Cliente ana = new Cliente("Luis", "Santa Maria, 10", "1313-131313");
        Cliente bruno = new Cliente("Flavio", "Rua B, 20", "0983-21212");

        // Erro tratado: preço negativo não derruba o programa
        try {
            new PratoExecutivo("Picanha", -10, 15);
        } catch (PrecoInvalidoException e) {
            System.out.println("Erro tratado: " + e.getMessage());
        }

        Pedido p1 = new Pedido(ana, LocalDate.now());
        p1.adicionar(new PratoExecutivo("Executivo de frango", 30, 20));
        p1.adicionar(new Combo("Combo hambúrguer", 40, 15));

        Pedido p2 = new Pedido(bruno, LocalDate.now());
        p2.adicionar(new PratoEspecial("Risoto", 50, 30, 25));
        p2.adicionar(new Combo("Combo pizza", 60, 25));

        ControleDePedidos controle = new ControleDePedidos();
        controle.registrar(p1);
        controle.registrar(p2);

        new GeradorRelatorio(new SaidaConsole()).gerar(controle);
    }
}
