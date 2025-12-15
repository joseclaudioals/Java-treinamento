package lista_4.questao4;

public class teste {
    public static void main (String[] args){
        ProdutoEstoque p = new ProdutoEstoque("batata", 2.4, 18);
        System.out.println("Valor estocado: R$ "+ p.calcularValorEstoque());
        System.out.println("" + p.toString());
        p.repor(10);
        p.vender(15);
        p.aplicarDesconto(34);
        System.out.println("" + p.toString());    }
    
}
