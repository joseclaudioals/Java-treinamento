package lista_5_hierarquia_polimorfismo_excecoes.questao7;
import java.time.LocalDate;

public class TarefaComPrazo extends Tarefa {
    private LocalDate prazo;

    protected TarefaComPrazo(String descricao, int prioridade, LocalDate prazo)throws PrazoExpiradoException{
        super(descricao, prioridade);
        this.prazo=prazo;
    }

    @Override
    public boolean concluir()throws PrazoExpiradoException{
        if(LocalDate.now().isAfter(prazo))
            throw new PrazoExpiradoException("a tarefa passou do prazo limite");

        return true;
    }
    
}
