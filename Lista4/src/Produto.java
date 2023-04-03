public class Produto {
    int codigo = 0;
    String descricao = "";
    double precoUnitario = 0;
    int quantidadeEstoque = 0;

    public Produto(int codigo, String descricao, double precoUnitario, int quantidadeEstoque){
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double calcularValorEstoque(){
        double valorEstoque = this.precoUnitario * this.quantidadeEstoque;
        return valorEstoque;
    }

    public void adicionarEstoque(int qtdIncremento){
        this.quantidadeEstoque =  quantidadeEstoque + qtdIncremento;
    }

    public void removerEstoque(int qtdDrecremento){
        this.quantidadeEstoque = quantidadeEstoque - qtdDrecremento;
    }
}