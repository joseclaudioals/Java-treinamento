package questao6;
import java.util.Arrays;

public class FiltroVetor{
    public static void main(String[]args){
        FiltroImpar vp = new FiltroImpar(new int[] {1, 2, 3, 4, 5});

        System.out.println("Numeros pares:" + Arrays.toString(vp.pares()));
        System.out.println("Numeros impares:" + Arrays.toString(vp.impares()));
        System.out.println("" + vp.relatorio());
    }
}