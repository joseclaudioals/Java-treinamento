import java.util.Scanner;

public class questao14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("insira um numero entre 0 e 20");
        int n = sc.nextInt();

        if(n==0 || n==1)
            System.out.printf("fatorial de %d = 1", n);
            else if(n>1){
                int fatorial = 1;
                for(int i=2; i<=n; i++){
                    fatorial = fatorial * i;
                }
                System.out.printf("fatorial de %d = %d", n, fatorial);
            }
                else
                    System.out.printf("o numero eh grande demais e o programa não tankou");
    }
}
