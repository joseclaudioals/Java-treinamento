import java.util.Scanner;

public class questao8{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Preço passagem");
        System.out.println("insira a distancia da viagem em km");
        float distancia = sc.nextFloat();

        if(distancia<=200)
            System.out.printf("valor da passagem: R$%.2f", distancia*0.5);
            else 
                System.out.printf("Preco da passagem: R$%.2f", distancia*0.45);
    }
}
