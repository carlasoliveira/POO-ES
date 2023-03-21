package ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o nome da pessoa: ");
        String nome = teclado.nextLine();
        System.out.println("Insira o dia do nascimento: ");
        int diaNasc = teclado.nextInt();
        System.out.println("Insira o mês do nascimento: ");
        int mesNasc = teclado.nextInt();
        System.out.println("Insira o ano do nascimento: ");
        int anoNasc = teclado.nextInt();
        imprimirDados(calculoIdade(nome, diaNasc, mesNasc, anoNasc));
    }
    
     public static String calculoIdade(String nome, int dia, int mes, int ano){
        int idade;
         if(mes>3){
            idade = 2023 - ano - 1;
        } else if(mes==3 && dia >=15){
            idade = 2023 - ano - 1;
        }
        else{
            idade = 2023 - ano;
        }
        String retorno = "" + nome + " - " + idade + " anos";
        return retorno;
    }
     
     public static void imprimirDados(String frase){
         System.out.println(frase + " em 15/03/2023");
     }
}