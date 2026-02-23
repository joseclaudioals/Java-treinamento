package lista_6.questao2;
import java.util.ArrayList;

public class Cliente {
    String nome;
    ArrayList<Pedido> historico_pedidos;

    Cliente(String nome){
        this.nome = nome;
        historico_pedidos = new ArrayList<>();
    }

    void criarPedido(){
        int tamanho = historico_pedidos.size();

        if(tamanho>=1){
            Pedido p = historico_pedidos.get(tamanho-1);
            if(!p.status){
                System.out.println("Finalize o ultimo pedido antes de adicionar um novo");
                return;
            }
        }

        Pedido p = new Pedido();
        historico_pedidos.add(p);
    }

    void mostrarStatus(){
        if(historico_pedidos.isEmpty()){
            System.out.println("Voce ainda nao tem nenhum pedido");
        }
        else{
            for(Pedido p:historico_pedidos)
                p.mostrarPedido();
        }
    }
}
