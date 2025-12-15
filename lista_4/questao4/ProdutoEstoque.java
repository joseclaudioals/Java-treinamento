package lista_4.questao4;

public class ProdutoEstoque {
    private String nome;
    private double preco;
    private int quantidade;

    protected ProdutoEstoque(String nome, double preco, int quantidade){
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    protected boolean repor(int quantidade){
        if(quantidade>0){
            this.quantidade+=quantidade;
            return true;
        }
        return false;
    }

    protected boolean vender(int quantidade){
        if(quantidade<=this.quantidade){
            this.quantidade-=quantidade;
            return true;
        }
        return false;
    }

    protected boolean aplicarDesconto(double percentual){
        if(percentual>0 && percentual<=50){
            double porcentagem = (100-percentual)/100;

            preco = preco*porcentagem;

            return true;
        }
        return false;
    }

    protected double calcularValorEstoque(){
        return (double)quantidade*preco;
    }

    // setters 
    private void setNome(String nome){
        if(!nome.isBlank() && nome!=null){
            this.nome = nome;
        }
    }
    private void setQuantidade(int quantidade){
        if(quantidade>=0){
            this.quantidade = quantidade;
        }
    }

    private void setPreco(double preco){
        if(preco>0){
            this.preco = preco;
        }
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " | Preco: R$" + preco + " | Quantidade: "+ quantidade;
    }

}
