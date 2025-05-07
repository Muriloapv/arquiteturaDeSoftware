public class CadastroFactory {
    public static Cadastro criarCadastro(String tipo, String... dados) {
        if (tipo.equalsIgnoreCase("PESSOA")) {
            return new CadastroPessoa(dados[0], dados[1]);
        } else if (tipo.equalsIgnoreCase("EMPRESA")) {
            return new CadastroEmpresa(dados[0], dados[1]);
        }
        throw new IllegalArgumentException("Tipo de cadastro não suportado");
    }
} 