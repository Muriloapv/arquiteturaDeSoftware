public class CadastroEmpresa implements Cadastro {
    private String razaoSocial;
    private String cnpj;

    public CadastroEmpresa(String razaoSocial, String cnpj) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    @Override
    public void registrar() {
        System.out.println("Registrando empresa: " + razaoSocial + " com CNPJ: " + cnpj);
    }

    @Override
    public void validar() {
        System.out.println("Validando dados da empresa: " + razaoSocial);
    }
} 