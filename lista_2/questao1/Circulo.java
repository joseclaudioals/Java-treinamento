package lista_2.questao1;

public class Circulo {
    double raio;

    Circulo(double raio){
        this.raio=raio;
    }
    double calcularArea(){
        return Math.PI * Math.pow(this.raio, 2);
    }
    double calcularPerimetro(){
        return 2*Math.PI*this.raio;
    }
    void imprimirMetodos(Circulo circulo){
        System.out.printf("Tamanho da area: %.2f\n", circulo.calcularArea());
        System.out.printf("Tamanho do perimetro: %.2f\n", circulo.calcularPerimetro());
    }
}
