import java.util.Scanner;

public class questao13 {
    public static void main(String[]args){
        int n=0, con=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("insira um valor n positivo qualquer:");
            n = sc.nextInt();

            if(n>0){
                System.out.print("primos: ");
                for(int i = 2; i<=n; i++){
                    boolean ehprimo = true;
                    for(int y = 2; y<=Math.sqrt(i); y++){
                        if(i%y==0){
                            ehprimo = false;
                            break;
                        }
                    }
                    if(ehprimo){
                        System.out.print(" " + i);
                        con++;
                    }
                }
                System.out.printf("\nQnt primos: %d", con);
            }
        }while(n<=0);
    }
}
