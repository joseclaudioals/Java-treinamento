package lista_2.questao4;

public class Estoque {
    String nome;
    int qtdAtual;
    int qtdMinima;

    Estoque(){}
    Estoque(String nome, int qtdAtual, int qtdMinima){
        this.nome = nome;
        if(qtdAtual>0)
            this.qtdAtual = qtdAtual;
        if(qtdMinima>0)
            this.qtdMinima = qtdMinima;
    }
    void repor(int qnt){
        if(qnt>0)
            this.qtdAtual+=qnt;
            else 
                System.out.println("impossivel realizar esta operação");
    }
    void darBaixa(int qnt){
        if(qtdAtual>qnt)
            this.qtdAtual-=qnt;
            else    
                System.out.println("impossivel realizar esta operação");

    }
    String descricao(){
        return "\nEstoque - " + this.nome + "\nQuantidade atual de Itens: "+ this.qtdAtual + "\nQuantidade minima de Itens: " + this.qtdMinima;
    }
    boolean precisaRepor(){
        return this.qtdAtual<=qtdMinima;
    }

}
