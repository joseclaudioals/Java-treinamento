package lista_4.questao6;

public class Contato {
    private String nome;
    private String telefone;

    protected Contato(String nome, String telefone){
        setNome(nome);
        setTelefone(telefone);
    }

    private void setNome(String nome){
        if(nome!=null && !nome.isEmpty()){
            this.nome=nome;
        }
    }
    private void setTelefone(String telefone){
        if(telefone != null && telefone.matches("\\d{8,}")){
            this.telefone = telefone;
        }
    }

    public String getnome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public Contato getContato(){
        return new Contato(this.nome, this.telefone);
    }
    
}
