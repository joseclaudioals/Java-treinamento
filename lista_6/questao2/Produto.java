package lista_6.questao2;
import java.math.*;

public class Produto {
    String nome;
    BigDecimal preco;

    Produto(String nome, String preco){
        this.nome=nome;
        this.preco = new BigDecimal(preco);
    }
}
