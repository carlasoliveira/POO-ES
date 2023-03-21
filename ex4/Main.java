package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa p = new Pessoa();
        System.out.println("Insira o nome da pessoa: ");
        p.nome = teclado.nextLine();
        System.out.println("Insira o dia do nascimento: ");
        p.diaNasc = teclado.nextInt();
        System.out.println("Insira o mês do nascimento: ");
        p.mesNasc = teclado.nextInt();
        System.out.println("Insira o ano do nascimento: ");
        p.anoNasc = teclado.nextInt();
        String resultado = p.calculoIdade(p.nome, p.diaNasc, p.mesNasc, p.anoNasc);
        System.out.println(resultado);
    }
}
