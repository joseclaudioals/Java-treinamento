package lista_6.questao2;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Pedido {
    ArrayList<ItemPedido> produtosComprados;
    BigDecimal frete;
    boolean status; // caso falso, o pedido ainda nao foi finalizado

    Pedido(){
        produtosComprados = new ArrayList<>();
        frete = new BigDecimal("15.00");
        status = false;
    }

    void finalizarPedido(){
        if(status)
            System.out.println("o pedido ja foi encerrado");

        BigDecimal tmp = calcularTotal();
        BigDecimal limite = new BigDecimal("100.00");

        if(tmp.compareTo(limite)>=0){
            frete = new BigDecimal("0.00");
            System.out.println("voce conseguiu frete gratis!!");
        }

        status = true;
    }

    void adicionarItemPedido(String nome, String preco, int qnt) throws IllegalArgumentException{
        if(nome == null || nome.isBlank() && !preco.matches("^(0|[1-9]\\d*)\\.\\d{2}$") && qnt <= 0)
            throw new IllegalArgumentException();
        else{
            if(!status){
                ItemPedido ip = new ItemPedido(nome, preco, qnt);
                produtosComprados.add(ip);
                System.out.println("produto adicionado ao pedido");
            }
            else
                System.out.println("O pedido ja foi encerrado");
        }
    }

    void mostrarPedido(){
        for(ItemPedido ip:produtosComprados){
            System.out.println("Nome: "+ ip.p.nome +"| Preco: "+ ip.p.preco +" | Quantidade: " + ip.qnt);
        }
        System.out.println("Valor total: " + calcularTotal());
        System.out.println("Frete: " + frete);
    }

    private BigDecimal calcularTotal(){
        BigDecimal vf = new BigDecimal("0.00");
        for(ItemPedido ip:produtosComprados){
            /*operações entre bigdecimais só podem ser realizadas com o mesmo tipo
            o construtor de bigdecimal recebe uma string, logo, tenho que converter
            a quantidade (int)a bigdecimal*/
            vf = vf.add(ip.p.preco.multiply(BigDecimal.valueOf(ip.qnt)));
        }

        return vf;
    }
}
