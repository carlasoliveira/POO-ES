package ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Funcionario um = new Funcionario();
        System.out.println("Informe o valor do salário: ");
        double salario = teclado.nextDouble();
        System.out.println("Informe o valor percentual do aumento: ");
        double aumento = teclado.nextDouble();

        double novoSalario = um.aumentaSalario(salario, aumento);
        System.out.println("Salário com " + aumento+ "% de reaujuste: R$" + novoSalario);
    }

}