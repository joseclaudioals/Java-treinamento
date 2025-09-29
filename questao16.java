import java.util.Scanner;

public class questao16 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("insira um numero");
        int n1 = sc.nextInt();
        System.out.println("insira OUTRO numero");
        int n2 = sc.nextInt();

        while(n2!=0){
            int temp = n2;
            n2 = n1%n2;
            n1 = temp;
        }
        System.out.print("MDC: " + n1);
    }
}
