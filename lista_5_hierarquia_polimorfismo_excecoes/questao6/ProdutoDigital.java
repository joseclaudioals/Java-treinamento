package lista_5_hierarquia_polimorfismo_excecoes.questao6;

public class ProdutoDigital implements Entregavel{
    private String nome;
    private double tamanhoMB;

    protected ProdutoDigital(String nome, double tamanhoMB)throws ProdutoInvalidoException{
        if(nome==null||nome.isBlank())
            throw new ProdutoInvalidoException("nome do produto nao deve ser vazio");
        if(tamanhoMB<=0)
            throw new ProdutoInvalidoException("Peso do produto deve ser maior que zero");

        this.nome=nome;
        this.tamanhoMB=tamanhoMB;
    }
    @Override
    public double calcularfrete(){return 0.0;}
    @Override
    public String getDescricao(){
        return "Digital: " + nome + " Tamanho: " + tamanhoMB + "MB";
    }

}
