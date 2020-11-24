
public final class TrianguloEscaleno extends Triangulo {

    public TrianguloEscaleno(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
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
        double p = (this.lado1 + this.lado2 + this.lado3) / 2;
        this.area = Math.sqrt(p * (p - this.lado1) * (p - this.lado2) * (p - this.lado3));
        return this.area;
    }

    @Override
    public String toString() {
        return "Triangulo Escaleno{lado um: " + lado1 + ", lado dois: " + lado2 + ", lado tres: " + lado3 + ", area: " + area + ", perimentro: " + perimetro + "}\n";
    }
}
