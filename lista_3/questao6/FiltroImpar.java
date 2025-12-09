package questao6;
import java.util.Arrays;

public class FiltroImpar{
    int[] numeros;

    FiltroImpar(int[] numeros){
        this.numeros = numeros;
    }

    int[] pares(){
        int size=0;
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]%2==0)
                size++;
        }

        int[] pares=new int[size];
        int j=0;
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]%2==0){
                pares[j]=numeros[i];
                j++;
            }
        }

        return pares;
    }

    int[] impares(){
        int size=0;
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]%2==1)
                size++;
        }

        int[] impares=new int[size];
        int j=0;
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]%2==1){
                impares[j]=numeros[i];
                j++;
            }
        }

        return impares;
    }

    String relatorio(){
        int[] pares=pares();
        int[] impares=impares();

        return "quantidade de pares:" + pares.length + "\nquantidade impares: "+ impares.length + "\n Array par:" + Arrays.toString(pares)+ "\nArray impar:" + Arrays.toString(impares);
    }
}