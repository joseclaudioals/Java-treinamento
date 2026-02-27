package lista_6.questao4;

public class PagamentoPix implements MetodoPagamento {

    PagamentoPix(){
    }

    @Override
    public boolean processarPagamento(double valor){
        System.out.printf("Valor final: R$ %.2f", valor * 0.9);

        return true;
    }
}
