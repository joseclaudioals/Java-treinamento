package lista_5_hierarquia_polimorfismo_excecoes.questao1;
import java.util.List;

public class FolhaDePagamento {
    public static double calcularTotal(List<Funcionario> funcionarios){
        if(funcionarios.size()==0 || funcionarios==null)
            return 0.0;

        double total = 0.0;

        for(Funcionario funcionario:funcionarios){
            if(funcionario!=null)
                total+=funcionario.calcularPagamento();
        }

        return total;
    }
}
