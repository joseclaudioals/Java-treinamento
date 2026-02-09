
import java.util.ArrayList;
import java.util.List;

public class ProcessadorPagamentos {
    List<Pagamento> pagamentos;

    public ProcessadorPagamentos(){
        this.pagamentos = new ArrayList<>();
    }

    // == metodos utilitarios da classe

    public void adicionarPagamento(Pagamento p)throws PagamentoInvalidoException{
        if(p==null)
            throw new PagamentoInvalidoException("Pagamento nao existente (pagamento nulo");

        if(p.isPago())
            throw new PagamentoInvalidoException("Pagamento jah realizado");

        this.pagamentos.add(p);
    }

    public void processarTodos(){
        for(Pagamento temp: this.pagamentos){
            try {
                temp.processarPagamento();
            } catch (PagamentoInvalidoException e) {
                System.out.println("Pagamento invalido:" + e.getMessage());
            } catch (FalhaProcessamentoException e) {
                System.out.println("Falha no processamento:" + e.getMessage());
            }
        }
    }

    public double calcularTotalPago(){
        double valorTotal = 0.0;

        for(Pagamento temp:pagamentos){
            valorTotal+=temp.getValor();
        }

        return valorTotal;
    }

    // == getters ==

    public List<Pagamento> getPagamentos(){
        return this.pagamentos;
    }
}