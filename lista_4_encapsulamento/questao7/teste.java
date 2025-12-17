package lista_4_encapsulamento.questao7;
import java.util.List;

public class teste {
    public static void main(String[] args){
        Carrinho c = new Carrinho();

        c.adicionarItens("batata", 2.4);
        c.adicionarItens("galinha", 11.89);
        c.adicionarItens("playstation 5", 3369.7);
        c.adicionarItens("lego star wars", 270);
        c.adicionarItens("essencia de baunilha", 13.47);

        c.removerItemIndice(4);

        List<String> tempI = c.getItens();
        List<Double> tempP = c.getPrecos();

        for(int i=0; i<tempI.size(); i++){
            System.out.println("Nome: " + tempI.get(i) + " | Preco: R$ " + tempP.get(i));
        }
        
    }
    
}

