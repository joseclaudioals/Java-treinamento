import java.util.Scanner;

public class questao10 {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int n=0;
      do{
        System.out.printf("insira um numero positivo qualquer: ");
        n = sc.nextInt();

        if(n>0){
          for(int i = 1; i<= n; i++){
              System.out.printf("  " + i);
          }
        }
        else
          System.out.printf("insira um valor valido");
      }while(n<=0);
    }
}
