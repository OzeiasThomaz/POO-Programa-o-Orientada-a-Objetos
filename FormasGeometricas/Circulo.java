
public class Circulo {

    private double raio;
    private double perimetro;
    private double area;

    public Circulo(double raio) {
        this.raio = raio;
        calculeArea();
        calculePerimetro();
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + ", perimetro=" + perimetro + ", area=" + area + '}';
    }

    public void calculePerimetro() {
        this.perimetro = 2 * Math.PI * this.raio;
    }

    public void calculeArea() {
        this.area = Math.PI * Math.pow(this.raio, 2);
    }
}
