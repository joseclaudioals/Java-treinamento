package questao7;

public class Teste {
    public static void main(String[]args){
        Produtos p1 = new Produtos("Abacate", 7.4, 5);
        Produtos p2 = new Produtos("Abacaxi", 6.3, 9);
        Produtos p3= new Produtos("Amoras", 3.5, 19);

        TabelaProdutos estoque = new TabelaProdutos(new Produtos[] {p1, p2, p3});

        for(int i=0; i<estoque.itens.length; i++){
            System.out.println(""+ estoque.itens[i].etiqueta());
        }

        System.out.println("Valor total de produtos do estoque:" + estoque.somaTotal());
        System.out.println("Produto mais caro: "+estoque.maisCaro().nome + " Preco: R$"+estoque.maisCaro().preco);

        
    }
}
