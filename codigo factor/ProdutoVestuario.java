public class ProdutoVestuario implements Produto {
    private String nome;
    private String tamanho;
    private String cor;

    public ProdutoVestuario(String nome, String tamanho, String cor) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    public void cadastrar() {
        System.out.println("Cadastrando produto de vestuário: " + nome + " - Tamanho: " + tamanho + " - Cor: " + cor);
    }

    @Override
    public void verificarEstoque() {
        System.out.println("Verificando estoque do produto de vestuário: " + nome);
    }
} 