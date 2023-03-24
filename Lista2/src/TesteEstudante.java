import java.util.Scanner;

public class TesteEstudante {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Nota 1 Estudante 1: ");
        double n1E1 = t.nextDouble();
        System.out.println("Nota 2 Estudante 1: ");
        double n1E2 = t.nextDouble();
        System.out.println("Nota 1 Estudante 2: ");
        double n2E1 = t.nextDouble();
        System.out.println("Nota 2 Estudante 2: ");
        double n2E2 = t.nextDouble();

        Estudante e1 = new Estudante(n1E1, n2E1);
        Estudante e2 = new Estudante(n1E2, n2E2);

        System.out.println("Média do Estudante 1: " + e1.media);
        System.out.println("Média do Estudante 2:  " + e2.media);
    }
}
