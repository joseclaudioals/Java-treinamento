package lista_2.questao7;
import java.util.Scanner;

public class Pessoa {
    String nome;
    int idade;
    double peso;
    double altura; //em metros 

    Pessoa(){
        this.nome = "";
        this.idade = 0;
        this.peso = 0;
        this.altura = 0;
    }

    void addNome(Scanner sc){
        System.out.println("Insira o nome da pessoa:");
        String tempString = sc.nextLine();
        this.nome = tempString;
    }
    void addIdade(Scanner sc){
        System.out.println("Insira a idade da pesssoa:");
        int tempIdade = sc.nextInt();
        this.idade = tempIdade;
    }
    void addPeso(Scanner sc){
        System.out.println("Insira o peso da pessoa(kg):");
        double tempPeso = sc.nextDouble();
        this.peso = tempPeso;
    }
    void addAltura(Scanner sc){
        System.out.println("Insira a altura da pessoa(m):");
        double tempAltura = sc.nextDouble();
        this.altura = tempAltura;
    }
    double imc(){
        return this.peso/Math.pow(this.altura, 2);
    }
    void imcCategoria(double imc){
        System.out.printf("Pessoa: %s\nIdade: %.2f\nPeso: %.2fkg\nAltura: %.2fm\n Resultado: ", this.nome, this.altura, this.peso, this.altura);
        if(imc<18.5)
            System.out.println("Abaixo do peso\n");
            else if(imc>=18.5 && imc<25)
                System.out.println("Peso normal\n");
                else if(imc>=25 && imc<30)
                    System.out.println("Sobrepeso\n");
                    else if(imc>=30 && imc<35)
                        System.out.println("Obesidade Grau I\n");
                        else if(imc>=35 && imc<40)
                            System.out.println("Obesidade grau II\n");
                            else 
                                System.out.println("Obesidade Grau III\n");
    }


}
