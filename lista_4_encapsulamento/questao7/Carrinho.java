package lista_4_encapsulamento.questao7;
import java.util.List;
import java.util.ArrayList;

public class Carrinho {
    private List<String> itens;
    private List<Double> precos;
    private double total;

    Carrinho(){
        itens = new ArrayList<String>();
        precos = new ArrayList<Double>();

        total=0.0;
    }

    boolean adicionarItens(String nomeItem, double precoItem){
        if(nomeItem==null || nomeItem.isEmpty())
            return false;
        if(precoItem<0)
            return false;

        itens.add(nomeItem);
        precos.add(precoItem);

        total+=precoItem;

        return true;
    }

    void removerItemIndice(int i){
        if(i>=0 && i<itens.size()){
            total-=precos.get(i);

            System.out.println("Nome: " + itens.get(i) + " | Preco: R$ " + precos.get(i));

            itens.remove(i);
            precos.remove(i);

            System.out.println("Item removido com sucesso");
            return;
        }
        System.out.println("Indice fora dos limites da lista");
    }

    // getters 

    List<String> getItens(){
        return List.copyOf(this.itens);
    }
    List<Double> getPrecos(){
        return List.copyOf(this.precos);
    }
    double getTotal(){
        return total;
    }    
}

