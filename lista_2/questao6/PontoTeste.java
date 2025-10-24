package lista_2.questao6;

public class PontoTeste {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(7, 9);
        Ponto p2 = new Ponto(3, 2);

        System.out.println("a distancia entre os dois pontos eh:"+ p1.distanciaPonto(p2.x, p2.y));
    }
}
