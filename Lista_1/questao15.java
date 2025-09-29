import java.util.Scanner;

public class questao15{
    public static void main(String[]args){
        int atual=1, anterior=0, fibonacci=0;
        Scanner sc = new Scanner(System.in);

        System.out.printf("insira um numero positivo qualquer\n");
        int n = sc.nextInt();

        if(n>=1)
            System.out.print("0 ");
        if(n>=2)
            System.out.print("1 ");
        if(n>2){
            for(int i = 3; i<n; i++){
                fibonacci = anterior + atual;
                System.out.print(" "+ fibonacci);
                anterior = atual;
                atual = fibonacci;
            }
        }
    }
}