package lista_2.questao5;

public class Aluno{
    String matricula;
    String nome;
    double nota1;
    double nota2;
    double notaTrabalho;
    double media;

    Aluno(){}
    Aluno(String matricula, String nome, double nota1, double nota2, double notaTrabalho){
        this.matricula=matricula;
        this.nome=matricula;
        this.nota1=nota1;
        this.nota2=nota2;
        this.notaTrabalho=notaTrabalho;
    }

    double media(double nota1, double nota2, double notaTrabalho){
        return (((nota1+nota2)*2.5)+(notaTrabalho*2))/3;
    }
    
    boolean provaFinal(){
        return this.media<7;
    }
}
