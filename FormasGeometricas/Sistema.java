
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        int op;
        int numeroOP = 0;
        List dados = new ArrayList();
        List tIsosceles = new ArrayList();
        List tEquilatero = new ArrayList();
        List tEscaleno = new ArrayList();

        do {

            System.out.println("Selecione uma opção:\n"
                    + " 1- adicionar Retângulo\n"
                    + " 2- adicionar Círculo\n"
                    + " 3- adicionar Quadrado\n"
                    + " 4- adicionar Triangulo\n"
                    + " 9- executar calculos\n "
                    + " 0- Sair\n");
            Scanner leitura = new Scanner(System.in);
            Scanner ler = new Scanner(System.in);
            op = leitura.nextInt();

            switch (op) {
                case 1:
                    float altura;
                    float base;

                    System.out.println("Informe altura: ");
                    altura = leitura.nextFloat();

                    System.out.println("Informe base: ");
                    base = leitura.nextFloat();

                    Retangulo retangulo = new Retangulo(base, altura);
                    dados.add(retangulo);
                    numeroOP++;

                    break;

                case 2:
                    float raio;

                    System.out.println("informe raio: ");
                    raio = leitura.nextFloat();

                    Circulo circulo = new Circulo(raio);
                    dados.add(circulo);
                    numeroOP++;
                    break;
                case 3:
                    float lado;
                    System.out.println("Informe lado: ");
                    lado = leitura.nextFloat();

                    Quadrado quadrado = new Quadrado(lado);
                    dados.add(quadrado);
                    numeroOP++;
                    break;

                case 4:

                    double lado1;
                    double lado2;
                    double lado3;

                    System.out.println("Informe lado um: ");
                    lado1 = ler.nextDouble();

                    System.out.println("Informe lado dois: ");
                    lado2 = ler.nextDouble();

                    System.out.println("Informe lado tres: ");
                    lado3 = ler.nextDouble();

                    if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                        TrianguloEscaleno trianguloescaleno = new TrianguloEscaleno(lado1, lado2, lado3);
                        dados.add(trianguloescaleno);
                        numeroOP++;
                        System.out.println("Triangulo Escaleno\n");
                        break;

                    }
                    if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                        TrianguloEquilatero trianguloequilatero = new TrianguloEquilatero(lado1);
                        dados.add(trianguloequilatero);
                        numeroOP++;
                        System.out.println("Triangulo Equilatero\n");
                        break;
                    }
                    if (lado1 == lado2 && lado2 != lado3 && lado1 != lado3) {

                        TrianguloIsosceles trianguloisosceles = new TrianguloIsosceles(lado1, lado3);
                        dados.add(trianguloisosceles);
                        numeroOP++;
                        System.out.println("Triangulo Isosceles\n");
                        break;
                    }
                    if (lado2 == lado3 && lado2 != lado1 && lado3 != lado1) {

                        TrianguloIsosceles trianguloisosceles = new TrianguloIsosceles(lado1, lado3);
                        dados.add(trianguloisosceles);
                        numeroOP++;
                        System.out.println("Triangulo Isosceles\n");
                        break;

                    }
                    if (lado1 == lado3 && lado1 != lado2 && lado3 != lado2) {

                        TrianguloIsosceles trianguloisosceles = new TrianguloIsosceles(lado1, lado3);
                        dados.add(trianguloisosceles);
                        numeroOP++;
                        System.out.println("Triangulo Isosceles\n");
                        break;
                    }

                case 9:

                    for (int i = 0; i < dados.size(); i++) {
                        System.out.println(dados.get(i).toString());
                    }

                    break;
                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("opção invalida");

                    break;

            }

        } while (numeroOP <= 10);
        for (int i = 0; i < dados.size(); i++) {
            System.out.println(dados.get(i).toString());

        }
        System.out.println("\n\n\n");

    }

}
