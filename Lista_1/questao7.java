import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Rajuste salarial\n");
        System.out.printf("Insira o valor do seu salario: R$");
        float salario = sc.nextFloat();

        if(salario>1250)
            System.out.printf("Salario novo: R$%.2f", salario*1.10);
            else 
                System.out.printf("Salario novo: R$%.2f", salario*1.15);
    }
}
