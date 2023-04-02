public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(98723, "José da Silva", 9850);
        c1.imprimirDados();
        c1.depositar(1423);
        c1.imprimirDados();
        c1.sacar(4000);
        c1.imprimirDados();
    }
}
