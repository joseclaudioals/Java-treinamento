import java.util.Scanner;

public class questao5 {
    public static void main(String[]args){
        float valor, juros, prestacao; 
        int dias;
        Scanner sc= new Scanner(System.in);

        System.out.printf("valor:");
        valor=sc.nextFloat();
        System.out.printf("juros(em porcentagem):");
        juros=sc.nextFloat();
        System.out.printf("dias:");
        dias=sc.nextInt();

        prestacao = valor+(valor*((float)juros/100)*dias);

        System.out.printf("prestacao= R$%.2f", prestacao);
    }
    
}
