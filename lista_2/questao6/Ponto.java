package lista_2.questao6;

public class Ponto {
    double x;
    double y;
    Ponto(){
        this.x=0;
        this.y=0;
    }
    Ponto(double x, double y){
        this.x=x;
        this.y=y;
    }
    Ponto(Ponto objt){
        this.x=objt.x;
        this.y=objt.y;
    }
    
    double distanciaPonto(double x2, double y2){
        return Math.sqrt(Math.pow((this.x - x2), 2)+Math.pow((this.y-y2), 2));
    }
}
