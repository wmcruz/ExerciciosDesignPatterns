package exerciciosBuilder.algaWorks.builder;

import exerciciosBuilder.algaWorks.model.NotaFiscal;
import exerciciosBuilder.algaWorks.model.Pessoa;
import exerciciosBuilder.algaWorks.model.PessoaFisica;
import exerciciosBuilder.algaWorks.model.PessoaJuridica;

public class NotaFiscalBuilder {

    private NotaFiscal instancia;

    private String nome;
    private String cpfOrCnpj;

    public NotaFiscalBuilder() {
        this.instancia = new NotaFiscal();
    }

    public NotaFiscalBuilder pessoaFisica(String nome, String cpfOrCnpj) {
        this.nome = nome;
        this.cpfOrCnpj = cpfOrCnpj;
        this.definirPessoa(1);

        return this;
    }

    public NotaFiscalBuilder pessoaJuridica(String nome, String cpfOrCnpj) {
        this.nome = nome;
        this.cpfOrCnpj = cpfOrCnpj;
        this.definirPessoa(2);

        return this;
    }

    public void definirPessoa(int tipoPessoa) {
        Pessoa pessoa;

        if (tipoPessoa == 1)
            pessoa = new PessoaFisica(nome, cpfOrCnpj);
        else
            pessoa = new PessoaJuridica(nome, cpfOrCnpj);

        this.instancia.setPessoa(pessoa);
    }
}