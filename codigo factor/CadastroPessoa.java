public class CadastroPessoa implements Cadastro {
    private String nome;
    private String cpf;

    public CadastroPessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public void registrar() {
        System.out.println("Registrando pessoa: " + nome + " com CPF: " + cpf);
    }

    @Override
    public void validar() {
        System.out.println("Validando dados da pessoa: " + nome);
    }
} 