
import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pessoa[] pessoa = new Pessoa[50];

        for(int i = 0; i < pessoa.length; i++){
            System.out.println("Insira o dia do nascimento da pessoa " + (i+1));
            int diaNascimento = s.nextInt();
            System.out.println("Insira o mês do nascimento da pessoa "+ (i+1));
            int mesNascimento = s.nextInt();
            System.out.println("Insira o ano do nascimento da pessoa "+ (i+1));
            int anoNascimento = s.nextInt();

            pessoa[i] = new Pessoa(diaNascimento, mesNascimento, anoNascimento);
        }

        for(int i = 0; i < pessoa.length; i++){
            System.out.println("Pessoa "+i+" = Data de Nascimento: "+pessoa[i].diaNascimento+"/"+pessoa[i].mesNascimento+"/"+pessoa[i].anoNascimento+"\n Idade: "+pessoa[i].idade);
        }

    }
}
