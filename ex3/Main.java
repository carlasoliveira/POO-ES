package ex3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SomaNumero objeto = new SomaNumero();
        System.out.println("Informe um número: ");
        int numero = teclado.nextInt();
        int somaNumero = objeto.somaNumero(numero);
        System.out.println("Soma de 0 até "+numero+": "+somaNumero);
        
    }
}
