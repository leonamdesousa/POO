public class Quadrado implements AreaCalculavel{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public Quadrado(float lado) {
    }

    public double calcularArea(){

        return lado * lado;
    }

}

