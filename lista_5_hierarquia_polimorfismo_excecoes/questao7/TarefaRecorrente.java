package lista_5_hierarquia_polimorfismo_excecoes.questao7;

public class TarefaRecorrente extends Tarefa{
    private int vezes;

    protected TarefaRecorrente(String descricao, int prioridade, int vezes)throws PrazoExpiradoException{
        super(descricao, prioridade);
        this.vezes=vezes;
    }

    @Override
    public boolean concluir()throws PrazoExpiradoException{
        if(vezes>0){
            vezes--;
            return false;
        }
        return true;
    }

}
