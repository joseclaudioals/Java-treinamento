package lista_5_hierarquia_polimorfismo_excecoes.questao7;

public abstract class Tarefa{
    private String descricao;
    private int prioridade;

    protected Tarefa(String descricao, int prioridade) throws PrazoExpiradoException{
        if(descricao==null||descricao.isBlank())
            throw new PrazoExpiradoException();

        if(prioridade<1 && prioridade>5)
            throw new PrazoExpiradoException();

        this.descricao=descricao;
        this.prioridade=prioridade;
    }

    public abstract boolean concluir()throws PrazoExpiradoException;
}
