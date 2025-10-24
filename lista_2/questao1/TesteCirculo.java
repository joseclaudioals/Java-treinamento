package lista_2.questao1;
import java.util.Scanner;

public class TesteCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo c1 = new Circulo(3);
        Circulo c2 = new Circulo(4);
        Circulo c3 = new Circulo(7);

        System.err.println("circulo 1");
        c1.imprimirMetodos(c1);
        System.err.println("circulo 2");
        c2.imprimirMetodos(c2);
        System.err.println("circulo 3");
        c3.imprimirMetodos(c3);

        System.out.printf("insira o  raio pra criar um circulo\n");
        double r1 = sc.nextDouble();
        Circulo ct1 = new Circulo(r1);

        System.out.printf("insira o  raio pra criar um circulo\n");
        double r2 = sc.nextDouble();
        Circulo ct2 = new Circulo(r2);

        System.out.printf("insira o  raio pra criar um circulo\n");
        double r3 = sc.nextDouble();
        Circulo ct3 = new Circulo(r3);
        
        System.err.println("circulo 1");
        ct1.imprimirMetodos(ct1);
        System.err.println("circulo 2");
        ct2.imprimirMetodos(ct2);
        System.err.println("circulo 3");
        ct3.imprimirMetodos(ct3);

        sc.close();
    }
}
