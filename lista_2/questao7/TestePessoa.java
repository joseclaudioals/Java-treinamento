package lista_2.questao7;
import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa p1 = new Pessoa();

        p1.addNome(sc);
        p1.addIdade(sc);
        p1.addPeso(sc);
        p1.addAltura(sc);

        p1.imcCategoria(p1.imc());
    }
}
