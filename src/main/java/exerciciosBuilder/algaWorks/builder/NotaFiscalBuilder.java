package exerciciosBuilder.algaWorks.builder;

import exerciciosBuilder.algaWorks.model.NotaFiscal;
import exerciciosBuilder.algaWorks.outros.NotaFiscalPessoaFisica;
import exerciciosBuilder.algaWorks.outros.NotaFiscalPessoaJuridica;

public class NotaFiscalBuilder {

    public NotaFiscalBuilderValido dePessoaFisica() {
        NotaFiscal instancia = new NotaFiscalPessoaFisica();
        return new NotaFiscalBuilderValido(instancia);
    }

    public NotaFiscalBuilderValido dePessoaJuridica() {
        NotaFiscal instancia = new NotaFiscalPessoaJuridica();
        return new NotaFiscalBuilderValido(instancia);
    }
}