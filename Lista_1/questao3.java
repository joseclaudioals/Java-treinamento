import java.util.Scanner;
 public class questao3 {
    public static void main(String[]args){
        double celcius, fahrenheit;

        Scanner sc = new Scanner(System.in);

        System.out.printf("temperatura em celcius: cº");
        celcius = sc.nextDouble();

        fahrenheit = (9*celcius+160)/5;

        System.out.printf("fahrenheit=%.1f", fahrenheit);
        
    }
 }