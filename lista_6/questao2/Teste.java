package lista_6.questao2;

public class Teste {
    public static void main(String[] args){
        System.out.println("criando cliente...");
        Cliente c = new Cliente("Jose Claudio");

        c.mostrarStatus();
        c.criarPedido();

        try{
            c.historico_pedidos.get(0).adicionarItemPedido("batata", "4.50", 5);
            c.historico_pedidos.get(0).adicionarItemPedido("cenoura", "2.50", 8);
            c.historico_pedidos.get(0).adicionarItemPedido("abobora", "9.00", 1);
        }catch(IllegalArgumentException e){
            System.out.println("Algum dos argumentos ao criar um pedido esta errado!");
        }

        c.historico_pedidos.get(0).mostrarPedido();
        c.criarPedido();
        c.historico_pedidos.get(0).finalizarPedido();

        try{
            c.historico_pedidos.get(0).adicionarItemPedido("bombril", "7.20", 1);
        }catch(IllegalArgumentException e){
            System.out.println("Algum dos argumentos ao criar um pedido esta errado!");
        }

        c.criarPedido();

        try{
            c.historico_pedidos.get(1).adicionarItemPedido("" ,"189.8192", -3);
        }catch(IllegalArgumentException e){
            System.out.println("Algum dos argumentos ao criar um pedido esta errado!");
        }

        try{
            c.historico_pedidos.get(1).adicionarItemPedido("Lego batman", "339.90", 1);
        }catch(IllegalArgumentException e){
            System.out.println("Algum dos argumentos ao criar um pedido esta errado!");
        }

        c.historico_pedidos.get(1).mostrarPedido();
        c.historico_pedidos.get(1).finalizarPedido();
        c.mostrarStatus();
    }
}
