package algaworks.builder;

import algaworks.builder.model.NotaFiscal;
import algaworks.builder.outros.NotaFiscalPessoaFisica;
import algaworks.builder.outros.NotaFiscalPessoaJuridica;

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