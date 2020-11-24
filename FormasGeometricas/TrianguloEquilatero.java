
public final class TrianguloEquilatero extends Triangulo {

    public TrianguloEquilatero(double lado) {
        super(lado, lado, lado);
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
        this.area = ((Math.pow(this.lado1, 2) * Math.sqrt(3)) / 4);
        return this.area;
    }

    @Override
    public String toString() {
        return "Triangulo Equilatero{lado um: " + lado1 + ", lado dois: " + lado2 + ", lado tres: " + lado3 + ", area: " + area + ", perimentro: " + perimetro + "}\n";
    }
}
