package exerciciosBuilder.algaWorks.model;

public class PessoaFisica extends Pessoa {
    // atributtes
    private String cpf;

    // constructor
    public PessoaFisica(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
    }

    // getters and setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}