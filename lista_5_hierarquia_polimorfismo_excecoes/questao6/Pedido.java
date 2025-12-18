package lista_5_hierarquia_polimorfismo_excecoes.questao6;
import java.util.*;

public class Pedido {
    private List<Entregavel> itens;

    protected Pedido(){
        itens = new ArrayList<>();
    }

    public void add(Entregavel e)throws ProdutoInvalidoException{
        if(e==null){
            throw new ProdutoInvalidoException("Produto invalido");
        }

        itens.add(e);
    }

    public double Calcularfrete(){
        double totalFrete=0.0;
        for(Entregavel temp:itens)
            totalFrete+=temp.calcularfrete();

        return totalFrete;
    }

    public String ListarItens(){
        String listaItens = "LISTA DE PRODUTOS PEDIDOS\n";

        for(Entregavel temp:itens)
            listaItens+=temp.getDescricao();

        return listaItens;
    }
}
