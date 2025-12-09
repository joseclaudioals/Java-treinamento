package questao7;

public class Produtos {
    String nome;
    double preco;
    int qnt;

    Produtos(String nome, double preco, int qnt){
        this.nome=nome;
        this.preco=preco;
        this.qnt=qnt;
    }

    double total(){
        return preco*qnt;
    }

    String etiqueta(){
        return String.format("Nome: %s - %d x R$ %.2f = R$%.2f", nome, qnt, preco, total());
    }
}
