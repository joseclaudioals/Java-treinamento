import java.util.Scanner;

public class questao4 {
    public static void main(String[]args){
        double raio, area;
        final double pi = 3.14;
        Scanner sc = new Scanner(System.in);

        System.out.printf("insira o valor do raio do circulo(cm):\n");
        raio=sc.nextDouble();

        area = pi*(raio*raio);

        System.out.printf("o valor da area do circulo de raio %.2f eh %.2fcm2", raio, area );
    }
}
