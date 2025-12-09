package questao7;

public class TabelaProdutos {
    Produtos[] itens;

    TabelaProdutos(Produtos[] itens){
        this.itens = itens;
    }

    double somaTotal(){
        double somaTotal=0;
        for(int i=0; i<itens.length; i++){
            somaTotal+=itens[i].total();
        }

        return somaTotal;
    }

    Produtos maisCaro(){
        Produtos maisCaro=itens[0];
        for(int i=1; i<itens.length; i++){
            if(maisCaro.preco==itens[i].preco)
                continue;
            if(maisCaro.preco<itens[i].preco)
                maisCaro=itens[i];
        }
        return maisCaro;
    }
}
