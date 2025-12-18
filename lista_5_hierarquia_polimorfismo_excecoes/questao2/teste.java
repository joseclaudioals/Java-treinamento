package lista_5_hierarquia_polimorfismo_excecoes.questao2;
import java.util.List;
import java.util.ArrayList;

public class teste {
    public static void main(String args[]){
        List<Tributavel> itens = new ArrayList<>();

        try {
            Tributavel t1 = new Carro("marea turbo", 15000);
            Tributavel t2 =  new Moto("pop", 5000);
            Tributavel t3 = new Caminhao("Otimus prime", 250009);
            Tributavel t4 = null;

            itens.add(t1);
            itens.add(t2);
            itens.add(t3);
            itens.add(t4);

            double total = SistemaImpostos.somarImpostos(itens);

            System.out.println("valor do imposto a ser pago: R$ "+ total);

        } catch (DadoInvalidoException e) {
            System.out.println("Erro ao criar objeto tributável: "+ e.getMessage());
        }
    }
    
}
