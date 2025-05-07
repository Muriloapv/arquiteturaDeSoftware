public class ProdutoEletronico implements Produto {
    private String nome;
    private String modelo;
    private double preco;

    public ProdutoEletronico(String nome, String modelo, double preco) {
        this.nome = nome;
        this.modelo = modelo;
        this.preco = preco;
    }

    @Override
    public void cadastrar() {
        System.out.println("Cadastrando produto eletrônico: " + nome + " - Modelo: " + modelo + " - Preço: R$" + preco);
    }

    @Override
    public void verificarEstoque() {
        System.out.println("Verificando estoque do produto eletrônico: " + nome);
    }
} 