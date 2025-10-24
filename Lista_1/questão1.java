import java.util.Scanner;

public class questão1{
    public static void main(String[]args){
        double cotacaoDolar, valorReais, conversao;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("= convercao real -> dolar \n");
        System.out.printf("insira o valor em reais:\n");
        valorReais=sc.nextDouble();
        
        System.out.printf("insira a cotacao do dolar\n");
        cotacaoDolar=sc.nextDouble();
        
        conversao = valorReais/cotacaoDolar;
        
        System.out.printf("Valor em reais = R$%.2f\nCotacao atual do dolar: RS$%.2f\nRS$%.2f em dolar: US$%.2f\n"
        ,valorReais, cotacaoDolar, valorReais, conversao);
        
        sc.close();
    }
}