package lista_5_hierarquia_polimorfismo_excecoes.questao4;

public abstract class NodeSistema {
    private String nome;

    protected NodeSistema(String nome)throws ArquivoInvalidoExeception{
        if(nome==null||nome.isBlank())
            throw new ArquivoInvalidoExeception("Nome do arquivo invalido");

        this.nome=nome;
    }

    protected String getNome(){
        return this.nome;
    }
    
    public abstract long getTamanho();
}
