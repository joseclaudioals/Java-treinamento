package lista_5_hierarquia_polimorfismo_excecoes.questao4;
import java.util.List;
import java.util.ArrayList;

public class Pasta extends NodeSistema{
    List<NodeSistema> filhos;

    protected Pasta(String nome)throws ArquivoInvalidoExeception{
        super(nome);
        filhos = new ArrayList<>();
    }

    public void addArquivo(NodeSistema n)throws ArquivoInvalidoExeception{
        String tempS = n.getNome().toLowerCase();
        for(NodeSistema temp: filhos){
            if(tempS.equalsIgnoreCase(temp.getNome()))
                throw new ArquivoInvalidoExeception("Nao pode haver dois arquivos com o mesmo nome na mesma pasta");
        }

        this.filhos.add(n);
    }

    @Override
    public long getTamanho() {
        long tamanhoTotal=0;

        for(NodeSistema temp:filhos){
            tamanhoTotal+=temp.getTamanho();
        }
        return tamanhoTotal;
    }

}
