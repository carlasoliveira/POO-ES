import java.util.Scanner;
public class TesteFuncionario {
    public static void main(String[] args) throws Exception {

        Scanner t = new Scanner(System.in);

        System.out.println("Valor do salário: ");
        double sBase = t.nextDouble();
        System.out.println("Total de vendas: ");
        int tVendas = t.nextInt();

        Funcionario func = new Funcionario(sBase, tVendas);

        func.imprimeAtributos();
    }
}