package lista_5_hierarquia_polimorfismo_excecoes.questao3;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private List<ItemDigital> itens;

    public Biblioteca(){
        this.itens = new ArrayList<>();
    }

    public void addItem(ItemDigital itemDigital)throws ItemInvalidoException{
        String tempS = itemDigital.getTitulo().replaceAll(" ", "");

        for(ItemDigital temp:itens){
            String cmpS = temp.getTitulo().replaceAll(" ", "");

            if(tempS.equalsIgnoreCase(cmpS))
                throw new ItemInvalidoException("Item com o mesmo nome já existente na biblioteca");
        }

        itens.add(itemDigital);
    }

    public List<ItemDigital> buscarPorPrefixo(String prefixo){
        List<ItemDigital> listaPrefixos = new ArrayList<>();
        if(prefixo==null || prefixo.isBlank())
            return listaPrefixos;

        for(ItemDigital temp:itens){
            if(temp.getTitulo().toLowerCase().startsWith(prefixo))
                listaPrefixos.add(temp);
        }

        return listaPrefixos;
    }

    public String gerarRelatorio(){
        String relatorio = "";
        for(ItemDigital temp: itens)
            relatorio+= temp.getDescricao() + "\n";

        return relatorio;
    }
}
