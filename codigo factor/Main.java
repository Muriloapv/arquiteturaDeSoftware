public class Main {
    public static void main(String[] args) {
        Produto produtoEletronico = ProdutoFactory.criarProduto("ELETRONICO", "Smartphone", "iPhone 13", "5999.99");
        produtoEletronico.verificarEstoque();
        produtoEletronico.cadastrar();

        Produto produtoVestuario = ProdutoFactory.criarProduto("VESTUARIO", "Camiseta", "M", "Azul");
        produtoVestuario.verificarEstoque();
        produtoVestuario.cadastrar();
    }
} 