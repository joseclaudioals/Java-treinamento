import java.util.Scanner;

public class questao2 {
    	public static void main(String[] args) {
		float precoComb, valorAbast, litros;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("insira o preco do combubustivel por litro\n");
		precoComb = sc.nextFloat();
		
		System.out.printf("insira o valor abastacido:\n");
		valorAbast = sc.nextFloat();
		
		litros=valorAbast/precoComb;
		
		System.out.printf("%.2f foram abastecidos no seu carro", litros);
	}
}
