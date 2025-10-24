package lista_2.questao2;

public class Funcionario {
    String nome;
    int horasTrabalhadas;
    double valorHora;

    Funcionario(String nome, int horasTrabalhadas, double valorHora){
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    Funcionario(){}

    double calcularSalario(){
        return this.valorHora*this.horasTrabalhadas;
    }
}
