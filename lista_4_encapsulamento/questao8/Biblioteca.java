package lista_4_encapsulamento.questao8;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
    private List<String> titulos;

    Biblioteca(){
        titulos = new ArrayList<String>();
    }

    protected boolean addTitulo(String novoTitulo){
        if(novoTitulo==null || novoTitulo.isBlank())
            return false;

        String sNormal = novoTitulo.trim().toLowerCase();

        for(String titulo: titulos){
            if(sNormal.equalsIgnoreCase(titulo))
                return false;
        }

        return titulos.add(sNormal);
    }

    protected boolean removeTitulo(String tituloR){
        if(tituloR==null)
            return false;

        for(int i=0; i<titulos.size(); i++){
            if(tituloR.equalsIgnoreCase(titulos.get(i))){
                System.out.println("livro removido");
                titulos.remove(i);
                return true;
            }
        }
        System.out.println("livro nao encontrado");
        return false;

    }

    protected List<String> buscaPrefixo(String prefixo){
        if(prefixo == null)
            return null;

        List<String> prefixoBuscado = new ArrayList<>();
        prefixo = prefixo.toLowerCase();

        for(String titulo:titulos){
            if(titulo.toLowerCase().startsWith(prefixo))
                prefixoBuscado.add(titulo);
        }

        return prefixoBuscado;
    }

    protected void ordenar(){
        Collections.sort(titulos);
    }

    protected void imprimir(){
        System.out.println("Titulos:");
        for(String titulo:titulos){
            System.out.println(titulo);
        }
        System.out.println("\n");
    }

    
}
