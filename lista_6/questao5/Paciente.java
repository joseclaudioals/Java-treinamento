package lista_6.questao5;
import java.time.*;

public class Paciente {
    private String nome;
    private LocalDate dataNascimento;

    public Paciente(String nome, LocalDate dataNascimento){
        setDataNascimento(dataNascimento);
        setNome(nome);
    }

    @Override
    public String toString(){
        return "\nNome:" + this.nome + "\nData de Nascimento" + this.dataNascimento.toString();
    }
    // -- setters

    public void setDataNascimento(LocalDate dataNascimento) throws IllegalArgumentException {
        if(!dataNascimento.isBefore(LocalDate.now()))
            throw new IllegalArgumentException("A data de nascimento deve ser diferente da data de hoje");
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome) throws IllegalArgumentException{
        if(nome.isEmpty())
            throw new IllegalArgumentException("O nome nao deve ser vazio");
        this.nome = nome;
    }

}
