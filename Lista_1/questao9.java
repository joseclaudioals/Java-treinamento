import java.util.Scanner;

public class questao9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Avalicao de Emprestimo Imobiliario");
        System.out.print("Insira o valor da sua casa:R$");
        float valorCasa = sc.nextFloat();
        System.out.print("Insira o valor do seu salario:R$");
        float salario = sc.nextFloat();
        System.out.println("Insira a quantidade de anos a pagar:");
        int anos = sc.nextInt();

        float prestacao = valorCasa/((float)anos*12);

        if(prestacao<=(salario*0.3))
            System.out.printf("Aprovado\nValor prestacao = R$%.2f");
            else 
                System.out.printf("Negado");
    }
}
