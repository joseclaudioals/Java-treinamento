package lista_5_hierarquia_polimorfismo_excecoes.questao2;
import java.util.List;

public class SistemaImpostos {
    public static double somarImpostos(List<Tributavel> itens){
        if(itens==null||itens.isEmpty()){
            return 0;
        }

        double total=0.0;

        for(Tributavel item:itens){
            if(item!=null)
                total+=item.calcularImposto();
        }

        return total;
    }
}
