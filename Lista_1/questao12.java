import java.util.Scanner;

public class questao12 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=0;
        do{
            int conPar=0, conImpa=0;
            System.out.println("insira um numero N positivo qualquer");
            n = sc.nextInt();

            if(n>0){
                for(int i = 1; i<=n; i++){
                    if(i%2==0)
                        conPar++;
                        else 
                            conImpa++;
                }
                System.out.println("pares e impares até " + n);
                System.out.printf("pares %d\nimpares %d", conPar, conImpa);
            }
            else
                System.out.println("insira um valor valido");
            
            
        }while(n<=0);
        
    }
}
