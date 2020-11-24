
public class Quadrado {

    private double perimetro;
    private double area;
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
        calculeArea();
        calculePerimetro();
    }

    @Override
    public String toString() {
        return "Quadrado{" + "perimetro=" + perimetro + ", area=" + area + ", lado=" + lado + '}';
    }

    public void calculePerimetro() {
        this.perimetro = 4 * this.lado;
    }

    public void calculeArea() {
        this.area = Math.pow(this.lado, 2);
    }
}
