
public final class TrianguloIsosceles extends Triangulo {

    public TrianguloIsosceles(double ladoIgual, double ladoDiferente) {
        super(ladoIgual, ladoIgual, ladoDiferente);
        calculePerimetro();
        calculeArea();
    }

    @Override
    public double calculePerimetro() {
        this.perimetro = this.lado1 + this.lado2 + this.lado3;
        return this.perimetro;

    }

    @Override
    public double calculeArea() {
        double altura = Math.sqrt(Math.pow(this.lado2, 2) - Math.pow((this.lado3 / 2), 2));
        this.area = (this.lado3 * altura) / 2;
        return this.area;
    }

    @Override
    public String toString() {
        return "Triangulo Isosceles{lado um: " + lado1 + ", lado dois: " + lado2 + ", lado tres: " + lado3 + ", area: " + area + ", perimentro: " + perimetro + "}\n";
    }

}
