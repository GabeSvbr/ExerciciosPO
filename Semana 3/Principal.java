import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Interaja para continuar...");
        scanner.nextLine();
        scanner.close();

        Autor autor1 = new Autor(   "Lezlie Benzies", "Ingles");
        Autor autor2 = new Autor(   "Hideaki Ano", "Japones");

        Livro livro1 = new Livro(   "Grand Theft Auto V", autor1, 2013, false);
        Livro livro2 = new Livro(   "Speed racer", autor1, 2005, false);
        Livro livro3 = new Livro(   "Evangelion", autor2, 1995, false);

        System.out.println(">>>Livro 1:    ");
        livro1.exibirFicha();

        System.out.println(">>>Livro 2:  ");
        livro2.exibirFicha();

        System.out.println(">>>Livro 3:  ");
        livro3.exibirFicha();

        System.out.println(">>>emprestando");
        livro1.emprestar();

        System.out.println(">>>emprestando dnv");
        livro1.emprestar();
    }
}
