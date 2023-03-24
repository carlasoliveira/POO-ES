public class Funcionario {
    double salarioBase = 0;
    int totalDeVendas = 0;
    double salarioFinal = 0;

    public Funcionario (double sBase, int tVendas){
        this.salarioBase = sBase;
        this.totalDeVendas = tVendas;

        if(this.totalDeVendas<0){
            this.salarioFinal = this.salarioBase - this.totalDeVendas;
        } else if(this.totalDeVendas > 0 && totalDeVendas <= 10000){
            this.salarioFinal = this.salarioBase + (this.salarioBase*0.1);
        } else if(this.totalDeVendas > 10000 && totalDeVendas <= 20000){
            this.salarioFinal = this.salarioBase + (this.salarioBase*0.15);
        } else if(this.totalDeVendas > 20000) {
            this.salarioFinal = this.salarioBase + (this.salarioBase*0.2);
        }
    }

    public void imprimeAtributos(){
        System.out.println("Salário base: R$" + this.salarioBase);
        System.out.println("Total de vendas: R$" + this.totalDeVendas);
        System.out.println("Salário final: R$" + this.salarioFinal);
    }
}
