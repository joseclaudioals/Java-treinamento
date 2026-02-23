package lista_6.questao2;

public class ItemPedido {
    Produto p;
    int qnt;

    ItemPedido(String nome, String preco, int qnt){
        p = new Produto(nome, preco);
        this.qnt = qnt;
    }
}
