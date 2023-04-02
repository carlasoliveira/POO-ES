public class Imovel {
    String endereco = "";
    double valorVenal = 0;
    double valorVenda = 0;

    public Imovel(String endImovel, double vVenal){
        this.endereco = endImovel;
        this.valorVenal = vVenal;
        this.valorVenda = vVenal + (vVenal*0.2);
    }

    public void imprimirDados(){
        System.out.println("Endereço do imóvel: "+ this.endereco);
        System.out.println("Valor venal do imóvel: "+ this.valorVenal);
        System.out.println("Valor de venda do imóvel: "+ this.valorVenda);
    }
}
