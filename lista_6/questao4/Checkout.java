package lista_6.questao4;

public class Checkout {
    void finalizarCompra(double valorCompra, MetodoPagamento metodo){
        System.out.println("Iniciando o checkout...");
        Boolean verificacao = metodo.processarPagamento(valorCompra);

        if(verificacao){
            System.out.println("Pagamento da compra realizado com sucesso");
        }else
            System.out.println("Falha ao pagar a compra tente novamente");
    }

}
