package lista_4_encapsulamento.questao8;
import java.util.List;

public class teste {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();

        b.addTitulo("o pequeno principe");
        b.addTitulo("alice no pais das maravilhas");
        b.addTitulo("o inferno de dante");
        b.addTitulo("1984");
        b.addTitulo("o incrivel mundo de gumball");
        b.addTitulo("frankenstein");
        b.addTitulo("o diario de dorian gray");

        b.removeTitulo("o incrivel mundo de gumball");

        List<String> tempB = b.buscaPrefixo("o");

        System.out.println("Titulos:");
        for(String titulo:tempB){
            System.out.println(titulo);
        }
        System.out.println("\n");

        b.imprimir();

        b.ordenar();
        b.imprimir();
    }
}
