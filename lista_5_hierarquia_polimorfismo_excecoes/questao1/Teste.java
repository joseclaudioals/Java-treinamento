package lista_5_hierarquia_polimorfismo_excecoes.questao1;
import java.util.List;
import java.util.ArrayList;

public class Teste {
    public static void main(String args[]){
        List<Funcionario> totalPagamento = new ArrayList<>();

        try {
            Funcionario f1 = new FuncionarioAssalariado("arthur", "111111", 1500);
            Funcionario f2 = new FuncionarioHorista("bob esponja", "2222", 8.56, 44);
            Funcionario f3 = new FuncionarioComissionado("Patrick", "333", 7200, 2);
            Funcionario f4 = null;

            totalPagamento.add(f1);
            totalPagamento.add(f2);
            totalPagamento.add(f3);
            totalPagamento.add(f4);

            Double total = FolhaDePagamento.calcularTotal(totalPagamento);

            System.out.println("Total da folha de pagamento: R$ " + total);
            
        } catch (DadoInvalidoException e) {
            System.out.println("Erro ao criar funcionario: "+ e.getMessage());
        }

    }
}
