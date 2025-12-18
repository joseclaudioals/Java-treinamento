package lista_5_hierarquia_polimorfismo_excecoes.questao7;

public class TarefaSimples extends Tarefa {
    protected TarefaSimples(String descricao, int prioridade)throws PrazoExpiradoException{
        super(descricao, prioridade);
    }

    @Override
    public boolean concluir()throws PrazoExpiradoException{
        return true;
    }
    
}
