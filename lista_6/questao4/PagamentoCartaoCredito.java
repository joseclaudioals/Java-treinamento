package lista_6.questao4;
import java.util.Random;

public class PagamentoCartaoCredito implements MetodoPagamento{
    private String nomeTitular;
    private long numeroCartao;
    private int quantidadeParcelas;

    public PagamentoCartaoCredito(String nomeTitular, int numeroCartao, int quantidadeParcelas){
        this.nomeTitular = nomeTitular;
        this.numeroCartao = numeroCartao;
        this.quantidadeParcelas = quantidadeParcelas;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.printf("Valor final: R$ %.2f \n", quantidadeParcelas>3?valor*1.05:valor);
        Random r = new Random();

        int ri = r.nextInt();

        return ri%2==0 ? true : false;
    }
}
