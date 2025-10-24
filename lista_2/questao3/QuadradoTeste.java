package lista_2.questao3;

public class QuadradoTeste {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(3);
        Quadrado q2 = new Quadrado(4);
        Quadrado q3 = new Quadrado(5);

        System.out.printf("quadrado 1\narea do quadrado: %.2f\nperimetro do quadrado: %.2f\n", q1.area(q1.lado), q1.perimetro(q1.lado));
        System.out.printf("quadrado 2\narea do quadrado: %.2f\nperimetro do quadrado: %.2f\n", q2.area(q2.lado), q2.perimetro(q2.lado));
        System.out.printf("quadrado 3\narea do quadrado: %.2f\nperimetro do quadrado: %.2f\n", q3.area(q3.lado), q3.perimetro(q3.lado));
    }
}
