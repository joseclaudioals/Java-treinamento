import java.util.Scanner;

public class questao11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("TABUADA");
        System.out.println("insira um numero n positivo qualquer");
        int n = sc.nextInt();

        if(n>0){
        for(int i = 1; i<= 10; i++){
            System.out.printf("%d x %d = %d\n", i, n, n*i);
        }
        }
        else
            System.out.print("insira um valor valido");
    }
}
