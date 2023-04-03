import java.util.Scanner;

public class TesteTriangulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe as medidas do triângulo: ");
        double ladoA = s.nextDouble();
        double ladoB = s.nextDouble();
        double ladoC = s.nextDouble();

        Triangulo tri = new Triangulo(ladoA, ladoB, ladoC);
        System.out.println("Triângulo informado é: " + tri.tipoTriangulo);
        System.out.println("Lados: "+ladoA+", "+ladoB+", "+ladoC+".");
    }
}
