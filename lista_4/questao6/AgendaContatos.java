package lista_4.questao6;
import java.util.ArrayList;
import java.util.List;

public class AgendaContatos{
    private List<Contato> contatos;

    protected AgendaContatos(){
        contatos = new ArrayList<Contato>();
    }

    boolean adicionarContato(String nome, String telefone){
        Contato p = new Contato(nome, telefone);

        if(!verificarExistente(p))
            return false;

        contatos.add(p);
        return true;
    }

    boolean removerContato(String nome){
        int index = buscaContato(nome);

        if(index==-1)
            return false;

        contatos.remove(index);
        return true;
    }

    Contato buscarContato(String nome){
        int index = buscaContato(nome);

        if(index==-1)
            return null;

        return contatos.get(index).getContato();
    }

    List<Contato> listarContatos(){
        return List.copyOf(this.contatos);
    }

    // -- metodos de apoio

    private boolean verificarExistente(Contato p){
        for(int i=0; i<contatos.size(); i++){
            if(contatos.get(i).getnome().equals(p.getnome())){
                System.out.println("Contato com mesmo nome já existente");
                
                return false;
            }
        }
        return true;
    }

    private int buscaContato(String nome){
        for(int i=0; i<contatos.size(); i++){
            if(contatos.get(i).getnome().equals(nome)){
                return i;
            }
        }
        System.out.println("Contato nao encontrado");
        return -1;
    }
    
}