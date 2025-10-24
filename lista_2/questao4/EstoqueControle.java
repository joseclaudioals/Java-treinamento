package lista_2.questao4;


public class EstoqueControle {
    public static void main(String[] args) {
        Estoque e1 = new Estoque("Impressora Jato de Tinta", 13, 6);
        Estoque e2 = new Estoque("Monitor LCD 17 Polegadas", 11, 13);
        Estoque e3 = new Estoque("Mouse Otico", 6, 2);

        e1.darBaixa(5);
        e2.repor(7);
        e3.darBaixa(4);

        if(e1.precisaRepor())
            System.out.println("nao precisa repor");
            else 
                System.out.println("precisa repor");

        if(e2.precisaRepor())
            System.out.println("nao precisa repor");
            else 
                System.out.println("precisa repor");

        if(e3.precisaRepor())
            System.out.println("nao precisa repor");
            else 
                System.out.println("precisa repor");
        
        System.out.println(""+ e1.descricao());
        System.out.println(""+ e2.descricao());
        System.out.println(""+ e3.descricao());
    }
}
