import java.util.Scanner;

public class questao6{
    public static void main(String[] args) {
        int velocidade;

        Scanner sc = new Scanner(System.in);

        System.out.printf("velocidade:");
        velocidade = sc.nextInt();

        if(velocidade>80)
            System.out.printf("VOCE ESTA MULTADO!!! valor da multa R$%.2f", 5*((float)velocidade-80));
            else
                System.out.printf("voce esta na borda da lei, sem multa");

    }
}