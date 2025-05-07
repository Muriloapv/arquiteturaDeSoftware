public class ProdutoFactory {
    public static Produto criarProduto(String tipo, String... dados) {
        if (tipo.equalsIgnoreCase("ELETRONICO")) {
            return new ProdutoEletronico(dados[0], dados[1], Double.parseDouble(dados[2]));
        } else if (tipo.equalsIgnoreCase("VESTUARIO")) {
            return new ProdutoVestuario(dados[0], dados[1], dados[2]);
        }
        throw new IllegalArgumentException("Tipo de produto não suportado");
    }
} 