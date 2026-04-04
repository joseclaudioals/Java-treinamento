package lista_6.questao5;
import java.util.ArrayList;

public class Medico {
    private String nome;
    private ArrayList<Consulta> agenda;
    private String especialidade;

    public Medico(String nome, String especialidade){
        setNome(nome);
        setEspecialidade(especialidade);
        agenda = new ArrayList<>();
    }

    // -- setters --
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // -- getters --

    public ArrayList<Consulta> getAgenda() {
        return agenda;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
