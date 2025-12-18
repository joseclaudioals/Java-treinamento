package lista_5_hierarquia_polimorfismo_excecoes.questao4;

public class Arquivo extends NodeSistema{
    private long tamanhoBytes;

    protected Arquivo(String nome, long tamanhoBytes) throws ArquivoInvalidoExeception{
        super(nome);
        if(tamanhoBytes<=0)
            throw new ArquivoInvalidoExeception("O tamanho do arquivo deve ser maior que 0");

        this.tamanhoBytes=tamanhoBytes;
    }

    @Override
    public long getTamanho() {
        return tamanhoBytes;
    }
}
