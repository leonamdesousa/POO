public class Retangulo implements AreaCalculavel{
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    public double calcularArea(){
        return largura * altura;
    }
}
