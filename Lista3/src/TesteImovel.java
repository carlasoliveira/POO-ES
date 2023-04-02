import java.util.Scanner;

public class TesteImovel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Endereço do imóvel: ");
        String endereco = s.nextLine();
        System.out.println("Valor venal do imóvel: ");
        double valorVenal  = s.nextDouble();

        Imovel imv = new Imovel(endereco, valorVenal);
        imv.imprimirDados();
    }
}
