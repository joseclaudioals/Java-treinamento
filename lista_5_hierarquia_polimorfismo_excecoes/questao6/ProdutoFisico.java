package lista_5_hierarquia_polimorfismo_excecoes.questao6;

public class ProdutoFisico implements Entregavel {
    private String nome;
    private double pesoKg;
    private double valor;

    protected ProdutoFisico(String nome, double pesoKg, double valor)throws ProdutoInvalidoException{
        if(nome==null||nome.isBlank())
            throw new ProdutoInvalidoException("nome do produto nao deve ser vazio");
        if(pesoKg<=0)
            throw new ProdutoInvalidoException("Peso do produto deve ser maior que zero");
        if(valor<=0)
            throw new ProdutoInvalidoException("Valor do produto deve ser maior que zero");

        this.nome=nome;
        this.pesoKg=pesoKg;
        this.valor=valor;
    }

    @Override
    public double calcularfrete(){
        return pesoKg*12.5;
    }
    @Override
    public String getDescricao(){
        return "NOME: " + nome + "VALOR: R$ " + valor + "PESO: " + pesoKg + "Kg";
    }
    
}
