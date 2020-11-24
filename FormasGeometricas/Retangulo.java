
public class Retangulo {

    private float base;
    private float altura;
    private float area;
    private float perimetro;

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
        calculeArea();
        calculePerimetro();

    }

    @Override
    public String toString() {
        return "Retangulo{" + "base=" + base + ", altura=" + altura + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

    public void calculePerimetro() {
        this.perimetro = 2 * this.base + 2 * this.altura;
    }

    public void calculeArea() {
        this.area = this.base * this.altura;
    }

}
