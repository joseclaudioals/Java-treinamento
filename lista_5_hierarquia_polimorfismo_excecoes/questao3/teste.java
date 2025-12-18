package lista_5_hierarquia_polimorfismo_excecoes.questao3;
import java.util.List;

public class teste {
    public static void main(String args[]){
        try {
            Biblioteca b = new Biblioteca();
            ItemDigital i1 = new LivroDigital("Frankenstein - O prometeus moderno", "Mary Sheley", 4);
            ItemDigital i2 = new VideoDigital("O robinho maneiro", 27, 17);
            ItemDigital i3 = new VideoDigital("o maniaco do parque - historia", 62, 32);
            ItemDigital i4 = new AudioDigital("Calcinha preta: as melhores", 102, 320);

            b.addItem(i1);
            b.addItem(i2);
            b.addItem(i3);
            b.addItem(i4);

            List<ItemDigital> itensBuscados = b.buscarPorPrefixo("o");

            for(ItemDigital temp:itensBuscados)
                System.out.println(temp.getTitulo());

            System.out.println(b.gerarRelatorio());

        } catch (ItemInvalidoException e) {
            System.out.println("Erro ao criar um item digital: " + e.getMessage());
        }
    }
    
}
