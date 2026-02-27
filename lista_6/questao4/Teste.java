package lista_6.questao4;

public class Teste {
    public static void main(String args[]){
        Checkout c = new Checkout();

        c.finalizarCompra(500, new PagamentoCartaoCredito("Jose Claudio", 819191, 3));
        c.finalizarCompra(500, new PagamentoCartaoCredito("Jose Claudio", 819191, 10));
        c.finalizarCompra(20, new PagamentoBoleto());
        c.finalizarCompra(500, new PagamentoPix());
    }
}
