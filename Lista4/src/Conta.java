public class Conta {
    double saldo;
    static int numeroDeContas;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
        numeroDeContas++;
    }

    static int getNumeroDeContas(){
        return numeroDeContas;
    }
}
