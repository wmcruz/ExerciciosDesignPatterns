package exerciciosBuilder.algaWorks.model;

public class PessoaJuridica extends Pessoa {
    // atributtes
    private String cnpj;

    // constructor
    public PessoaJuridica(String nome, String cnpj) {
        this.setCnpj(cnpj);
        this.setNome(nome);
    }

    // getters and setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}