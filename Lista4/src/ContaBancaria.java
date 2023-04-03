public class ContaBancaria{
    private double saldo;
    private double limite;
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getLimite() {
        return limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(double valorSaque){
        this.saldo = this.saldo - valorSaque;
    }

    public void depositar(double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: "+ this.saldo);
    }
}

/*public class ContaBancaria {
    int numeroConta = 0;
    String nomeTitular = "";
    double saldo = 0;
    double taxaDeJuros = 0;

    public ContaBancaria(int numConta, String titularConta, double saldo){
        this.numeroConta = numConta;
        this.nomeTitular = titularConta;
        this.saldo = saldo;
        if(this.saldo < 10000){
            this.taxaDeJuros = 0.05;
        } else if(this.saldo < 50000){
            this.taxaDeJuros = 0.10;
        } else {
            this.taxaDeJuros = 0.15;
        }
    }

    public void sacar(double valorSaque){
        this.saldo = this.saldo - valorSaque;
        if(this.saldo < 10000){
            this.taxaDeJuros = 0.05;
        } else if(this.saldo < 50000){
            this.taxaDeJuros = 0.10;
        } else {
            this.taxaDeJuros = 0.15;
        }
    }

    public void depositar(double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
        if(this.saldo < 10000){
            this.taxaDeJuros = 0.05;
        } else if(this.saldo < 50000){
            this.taxaDeJuros = 0.10;
        } else {
            this.taxaDeJuros = 0.15;
        }
    }

    public void imprimirDados(){
        System.out.println("Numero da conta: "+this.numeroConta);
        System.out.println("Nome do titular da conta: "+this.nomeTitular);
        System.out.println("Saldo atual: "+this.saldo);
        System.out.println("Taxa de juros baseada no saldo: "+this.taxaDeJuros);
    }
}
*/