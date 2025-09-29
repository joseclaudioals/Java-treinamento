import java.util.Scanner;

public class questao17 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double media=0, maior=0, menor=0, percentual=0;

        System.out.println("Insira a quantidade de notas a serem inseridas no sistema:");
        int n = sc.nextInt();

        double[] notas = new double[n];

        for(int i=0; i<n; i++){
            System.out.printf("\ninsira a %d° nota:", i + 1);
            notas[i]=sc.nextDouble();
            media+=notas[i];

            if(notas[i]>=7){
                percentual++;
            }
        }
        maior = notas[0];
        menor = notas[0];

        for(int i = 1; i<n; i++){
            if(notas[i]>maior)
                maior = notas[i];
            if(notas[i]<menor)
                menor= notas[i];
        }

        media = media/n;
        percentual = (percentual/n)*100;

        System.out.printf("media: %.2f\nmaior: %.2f\nmenor: %.2f\n>=:%.0f%%\n", media, maior, menor, percentual);
    }
}
