package lista_5_hierarquia_polimorfismo_excecoes.questao7;
import java.util.*;

public class Agenda {
    List<Tarefa> tarefas;

    public Agenda(){
        tarefas = new ArrayList<>();
    }
    
    public void add(Tarefa t){
        if(t==null){
            System.out.println("tarefa nula nao pode ser adicionada a agenda");
            return;
        }

        tarefas.add(t);
        System.out.println("Tarefa adiconada comm sucesso");
    }

    public void executarTodas(){
        for (Tarefa tarefa : this.tarefas) {
            try {

                if(tarefa.concluir())
                    System.out.printf("Tarefa {%s} concluida.\n");

            } catch (PrazoExpiradoException e) {
                System.out.printf("Nao foi possivel concluir: %s\n", e.getMessage());
            }
        }
    }
    
}
