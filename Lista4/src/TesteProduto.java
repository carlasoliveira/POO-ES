public class TesteProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Caneta", 1.50, 100);
        double valorEstoque = p1.calcularValorEstoque();
        System.out.println("Valor do estoque: R$"+valorEstoque);
        p1.adicionarEstoque(50);
        double novoValorEstoque = p1.calcularValorEstoque();
        System.out.println("Valor após reposição do estoque:  R$"+novoValorEstoque);
    }
}
