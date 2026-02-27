package lista_6.questao4;
import java.util.Random;

public class PagamentoBoleto implements MetodoPagamento{

    @Override
    public boolean processarPagamento(double valor) {
        Random r = new Random();

        long codigo = r.nextLong(1000, 10000);
        System.out.println("Boleto gerado! Pagamento em até 3 dias!!");
        System.out.println("Codigo: "+ codigo);
        return true;
    }
}
